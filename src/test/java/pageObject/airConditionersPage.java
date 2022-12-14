package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class airConditionersPage {
	
	WebDriver ldriver;
	
	public airConditionersPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
 
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[6]/a[1]/div[1]/div[1]/img[1]")
	@CacheLookup
	WebElement btnAppliances;
	
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[3]/div[5]/div[1]/div[3]/a[1]/div[1]/div[1]/img[2]")
	@CacheLookup
	WebElement btnAirconditioners;
	
	@FindBy(linkText="VIEW ALL")
	@CacheLookup
	WebElement btnViewall;
	
	@FindBy(linkText="Price -- Low to High")
	@CacheLookup
	WebElement btnLow;
	
	@FindBy(linkText="Price -- High to Low")
	@CacheLookup
	WebElement btnHigh;
	
	@FindBy(linkText="Newest First")
	@CacheLookup
	WebElement btnNewest;
	
	
	
	public void clickAppliances()
	{
		btnAppliances.click();
	}
	
	public void clickAirconditioners()
	{
		btnAirconditioners.click();
	}
	
	public void clickViewall()
	{
		btnViewall.click();
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

