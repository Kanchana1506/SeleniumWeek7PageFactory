package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class CreateLeadPage extends BaseClass {
	
	public CreateLeadPage(ChromeDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	WebElement eleclead;
	public void enterfrstname(String fname)
	{ 	eleclead.sendKeys(fname);	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	WebElement elelname;
	public void enterlastname(String lname)
	{ elelname.sendKeys(lname); }
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	WebElement elecname;
	public void entercmpnyname(String cmp)
	{ elecname.sendKeys(cmp); }
	
	@FindBy(how=How.NAME,using="submitButton")
	WebElement elecreate;
	public void clickcreate()
	{
		elecreate.click();		
	}

}
