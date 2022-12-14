package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mensFashionPage {
	
	WebDriver ldriver;
	
	public mensFashionPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
 
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[3]/a[1]/div[2]/div[1]/div[1]")
	@CacheLookup
	WebElement btnFashion;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[1]")
	@CacheLookup
	WebElement btnTopWear;
	
	@FindBy(xpath="//div[contains(text(),'Price -- Low to High')]")
	@CacheLookup
	WebElement btnLow;
	
	@FindBy(xpath="//div[contains(text(),'Price -- High to Low')]")
	@CacheLookup
	WebElement btnHigh;
	
	@FindBy(xpath="//div[contains(text(),'Newest First')]")
	@CacheLookup
	WebElement btnNewest;
	
	
	
	
	public void clickFashion()
	{
		btnFashion.click();
	}
	
	public void clickTopWear()
	{
		btnTopWear.click();
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
