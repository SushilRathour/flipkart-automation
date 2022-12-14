package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObject.cctvCameraPage;
import pageObject.loginPage;

public class smartLight_Test extends BaseClass {

	@Test(groups="home")
	public void test() throws InterruptedException {
		
		cctvCameraPage camera= new cctvCameraPage(driver);
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
		
	//	mp.clickFashion();
		Thread.sleep(1000);
		logger.info("**********clickin on electronics**********");
		camera.clickSmart();
		logger.info("**********clickin on cctv**********");
		camera.clickCCTV();
		Thread.sleep(1000);
		camera.clickLow();
		camera.clickHigh();
		camera.clickNewest();
		logger.info("**********test passed**********");
		
	}
}
