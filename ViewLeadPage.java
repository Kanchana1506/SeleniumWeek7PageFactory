package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {

	public ViewLeadPage(ChromeDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	public void viewlead()
	{
		String Leadtitle = driver.getTitle();
		System.out.println (Leadtitle);

	}

	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	WebElement elechngdname;
	
	public void chngedname() throws InterruptedException
	{
		String newcmpname = elechngdname.getText();
		
		System.out.println("old company name is " + oldcmpny );
		  System.out.println("new company name in view lead page is: " + newcmpname );
		  Thread.sleep(2000);
		  if ( oldcmpny.equals(bb)) 
			 { System.out.println ("name is not changed");} 
			 else
			 {System.out.println ("name is changed"); 
			 System.out.println("new name of the company is : "+ newcmpname);
			 }
}
}