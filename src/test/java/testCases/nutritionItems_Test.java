package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObject.loginPage;
import pageObject.nutritionItemsPage;

public class nutritionItems_Test extends BaseClass {

	@Test(groups="food")
	public void test() throws InterruptedException {
		
		nutritionItemsPage nutri= new nutritionItemsPage(driver);
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
		logger.info("**********clicking on nutrision**********");
		nutri.clickNutrition();
		Thread.sleep(1000);
		nutri.clickLow();
		nutri.clickHigh();
		nutri.clickNewest();
		logger.info("**********test passed**********");
		
	}
}
