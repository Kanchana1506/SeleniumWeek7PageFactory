package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage(ChromeDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//this keyword above represents page ....
	}
		
	@FindBy (how=How.ID,using="username")
	WebElement eleusername;
	
	public LoginPage enterusername(String uname)
	{
		eleusername.sendKeys(uname);
		return this;
	}
	
	@FindBy(how=How.ID, using = "password")
	WebElement elepwd;
	public LoginPage enterpassword(String pwd)
	{
		elepwd.sendKeys(pwd);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME, using = "decorativeSubmit")
	WebElement elelogin;
	
	public HomePage clicklogin()
	{
	elelogin.click();
		return new HomePage(driver);
	}

}
