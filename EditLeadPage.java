package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import base.BaseClass;

public class EditLeadPage extends BaseClass {
	
	public EditLeadPage(ChromeDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	WebElement elefname;
	public void fname()
	{ elefname.sendKeys("ktest6"); }
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	WebElement elefleadclick;
	public void fleadclick() throws InterruptedException
	{ 	elefleadclick.click();
		Thread.sleep(2000); }
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement elefrstlead;
	public void firstlead()
	{ elefrstlead.click(); }
	
	@FindBy(how=How.XPATH,using="//a[text()='Edit']")
	WebElement eleclicklead;
	public void clickedit()
	{ eleclicklead.click(); }
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	WebElement eleoldcmpny;
	public void clear()
	{
	 //oldcmpny = driver.findElementById("updateLeadForm_companyName").getAttribute("value");
//		System.out.println("old company name is " + oldcmpny );
		//driver.findElementById("updateLeadForm_companyName").getAttribute("value");
		//  driver.findElementById("updateLeadForm_companyName").clear();
		oldcmpny = eleoldcmpny.getAttribute("value");
		eleoldcmpny.clear();
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	WebElement elenewcmpny;
	public void cmpnyname()
	{
		  bb= "Laks tech";
		  elenewcmpny.sendKeys(bb);
	}
	
	@FindBy(how=How.XPATH,using="//input[@type=\"submit\"][@value=\"Update\"]")
	WebElement eleupdatclick;
	public void updateclick()
	{ eleupdatclick.click();}
}
