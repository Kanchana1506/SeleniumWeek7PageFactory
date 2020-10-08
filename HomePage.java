package pages;

import base.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
	
	public HomePage(ChromeDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how= How.LINK_TEXT,using="CRM/SFA")
	WebElement elecrm;
	
	public HomePage clickcrmsfa()
	{
		elecrm.click();
		return new HomePage(driver);	
	}
	
	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit")
	WebElement elelogout;
	
	public LoginPage clicklogout()
	{
		elelogout.click();
		return new LoginPage(driver);
	}
	
}
