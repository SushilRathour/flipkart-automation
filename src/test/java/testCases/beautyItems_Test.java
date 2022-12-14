package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObject.beautyItemsPage;
import pageObject.loginPage;

public class beautyItems_Test extends BaseClass {

	@Test(groups="fashion")
	public void test() throws InterruptedException {
		
		beautyItemsPage beauty= new beautyItemsPage(driver);
		loginPage lp=new loginPage(driver);
		lp.setUserName(username);
		logger.info("**********username is entered**********");
		lp.setPassword(password);
		logger.info("**********password is entered**********");
		lp.clickSubmit();
		Thread.sleep(1000);
		
		Actions ac= new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[9]/a[1]/div[1]/div[1]/img[1]"));
		ac.moveToElement(e).build().perform();
		Thread.sleep(1000);
		logger.info("**********clicking on beauty product**********");
		beauty.clickBeauty();
		Thread.sleep(1000);
		beauty.clickLow();
		beauty.clickHigh();
		beauty.clickNewest();
		logger.info("**********test passed**********");
		
	}
}
