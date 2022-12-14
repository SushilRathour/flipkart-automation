package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class smartLightPage {
	
	WebDriver ldriver;
	
	public smartLightPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[11]")
	@CacheLookup
	WebElement btnSmart;
	
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/a[1]/div[1]/img[2]")
	@CacheLookup
	WebElement btnSmartLight;
	
	@FindBy(xpath="//div[contains(text(),'Price -- Low to High')]")
	@CacheLookup
	WebElement btnLow;
	
	@FindBy(xpath="//div[contains(text(),'Price -- High to Low')]")
	@CacheLookup
	WebElement btnHigh;
	
	@FindBy(xpath="//div[contains(text(),'Newest First')]")
	@CacheLookup
	WebElement btnNewest;
	
	

	public void clickSmart()
	{
	    btnSmart.click();
	}
	
	public void clickSmartLight()
	{
		btnSmartLight.click();
	}
	
	public void clickLow()
	{
		btnLow.click();
	}
	
	public void clickHigh()
	{
		btnHigh.click();
	}
	
	public void clickNewest()
	{
		btnNewest.click();
	}
	
	
}
