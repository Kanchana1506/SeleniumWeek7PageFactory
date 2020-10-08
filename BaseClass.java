package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import utils.ReadExcel;

public class BaseClass {
	
	public ChromeDriver driver;
	public static String oldcmpny,bb;
	public String filename;

	@DataProvider(name="fetchdata") 
	public String[][] SendData() throws IOException
	 { 
		return ReadExcel.exceldata(filename); 
		}
	 
	
	@BeforeMethod
	public void precond()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	}
		
	 @AfterMethod 
	 public void postcond() 
	 { driver.close(); }
	

}
