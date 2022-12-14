package testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageObject.loginPage;

public class Login_Test extends BaseClass {
	
	@Test
	public void loginTest() throws IOException {
		
		logger.info("****************URL is opened**************");
		
		loginPage lp=new loginPage(driver);
		lp.setUserName(username);
		logger.info("****************username entered****************");
		lp.setPassword(password);
		logger.info("****************password entered****************");
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		{
			Assert.assertTrue(true);
			logger.info("****************test passed****************");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.error("****************test failed****************");
		}
	}

	
}
