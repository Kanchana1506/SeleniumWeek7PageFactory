package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class MyLeadsPage extends BaseClass  {
	
public MyLeadsPage(ChromeDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}

@FindBy(how=How.LINK_TEXT,using="Create Lead")
WebElement eleclead;

public void createlead()
{
eleclead.click();
}

 @FindBy(how=How.LINK_TEXT,using="Find Leads")
 WebElement eleflead;
public void findlead()
{
	eleflead.click();
} 
 
}
