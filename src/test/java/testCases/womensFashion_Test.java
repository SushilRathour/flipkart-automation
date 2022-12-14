package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObject.loginPage;
import pageObject.womenFashionPage;

public class womensFashion_Test extends BaseClass {

	@Test(groups="fashion")
	public void fashiontest() throws InterruptedException {
		
		womenFashionPage mp= new womenFashionPage(driver);
		loginPage lp=new loginPage(driver);
		lp.setUserName(username);
		logger.info("**********username is entered**********");
		lp.setPassword(password);
		logger.info("**********password is entered**********");
		lp.clickSubmit();
		Thread.sleep(1000);
		
		Actions ac= new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[3]/a[1]/div[2]/div[1]/div[1]"));
		ac.moveToElement(e).build().perform();
		Thread.sleep(1000);
		logger.info("**********clicking on western**********");
		mp.clickWestern();
		Thread.sleep(1000);
		mp.clickLow();
		mp.clickHigh();
		mp.clickNewest();
		logger.info("**********test passed**********");
		
	}
}
