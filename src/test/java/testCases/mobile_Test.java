package testCases;

import org.testng.annotations.Test;

import pageObject.loginPage;
import pageObject.mobilePage;

public class mobile_Test extends BaseClass {
	
	@Test(groups="electronics")
	public void test() throws InterruptedException {
		mobilePage mp=new mobilePage(driver);
		loginPage lp=new loginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		logger.info("**********username is entered**********");
		lp.clickSubmit();
		logger.info("**********password is entered**********");
		Thread.sleep(2000);
		
		
		mp.clickMobile();
		Thread.sleep(2000);
		mp.clickRealme();
		Thread.sleep(2000);
		mp.clickLow();
		mp.clickHigh();
		mp.clickNewest();
	}

}
