package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObject.homeDecorPage;
import pageObject.loginPage;

public class homeDecor_Test extends BaseClass {

	@Test(groups="home")
	@Parameters({"homee"})
	public void test() throws InterruptedException {
		
		homeDecorPage decor= new homeDecorPage(driver);
		loginPage lp=new loginPage(driver);
		lp.setUserName(username);
		logger.info("**********username is entered**********");
		lp.setPassword(password);
		logger.info("**********password is entered**********");
		lp.clickSubmit();
		Thread.sleep(1000);
		
		Actions ac= new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[5]/a[1]/div[2]/div[1]/div[1]"));
		ac.moveToElement(e).build().perform();
		Thread.sleep(1000);
		logger.info("**********clicking on homedecor**********");
		decor.clickDecor();
		Thread.sleep(1000);
		decor.clickLow();
		decor.clickHigh();
		decor.clickNewest();
		logger.info("**********test passed**********");
		
	}
}
