package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObject.laptopPage;
import pageObject.loginPage;

public class laptop_Test extends BaseClass {

	
	@Test(groups="electronics")
	public void test() throws InterruptedException {
		
		laptopPage laptop= new laptopPage(driver);
		loginPage lp=new loginPage(driver);
		lp.setUserName(username);
		logger.info("**********username is entered**********");
		lp.setPassword(password);
		logger.info("**********password is entered**********");
		lp.clickSubmit();
		Thread.sleep(1000);
		
		Actions ac= new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[4]/a[1]/div[2]/div[1]/div[1]"));
		ac.moveToElement(e).build().perform();
		Thread.sleep(1000);
		logger.info("**********clicking on laptop**********");
		laptop.clickLaptop();
		Thread.sleep(1000);
		laptop.clickLow();
		laptop.clickHigh();
		laptop.clickNewest();
		logger.info("**********test passed**********");
		
	}
}
