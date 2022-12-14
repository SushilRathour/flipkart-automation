package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mobilePage {
	
	WebDriver ldriver;
	
	public mobilePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
 
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]")
	@CacheLookup
	WebElement btnMobile;
	
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
	@CacheLookup
	WebElement btnRealme;
	
	@FindBy(xpath="//div[contains(text(),'Price -- Low to High')]")
	@CacheLookup
	WebElement btnLow;
	
	@FindBy(xpath="//div[contains(text(),'Price -- High to Low')]")
	@CacheLookup
	WebElement btnHigh;
	
	@FindBy(xpath="//div[contains(text(),'Newest First')]")
	@CacheLookup
	WebElement btnNewest;
	
	
	
	
	public void clickMobile()
	{
		btnMobile.click();
	}
	
	public void clickRealme()
	{
		btnRealme.click();
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
