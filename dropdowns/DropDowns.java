package dropdowns;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
	
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	String title=driver.getTitle();
	System.out.println(title);
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/S")).click();
	driver.findElement(By.linkText("Leads")).click(); 
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("e");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("prasanth");
	
	// For Selecting value as Employee in Source by Using SelectbyVisible text
	
	WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
    Select obj = new Select(source);
    obj.selectByVisibleText("Employee");
    
	// For Selecting value as Pay Per Click Advertising in MarketingCampaignId Using SelectbyValue
    
	WebElement source1=driver.findElement(By.name("marketingCampaignId"));
	Select obj1=new Select(source1);
	obj1.selectByValue("9001");
	
	//  For Selecting value as Corporation in OwnerShip field by Using SelectbyIndex
	
	WebElement source2=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select obj2=new Select(source2);
	obj2.selectByIndex(5);
	
	//  For Selecting value as India in Country Field by Using SelectbyVisibletext
	
	WebElement source3=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	Select obj3=new Select(source3);
	obj3.selectByVisibleText("India");
	
	// For Clicking on create Lead Button by Using name Locator
	 driver.findElement(By.name("submitButton")).click();
	 
	 // To Getting the Title of the resulting Page

	 String title1 = driver.getTitle();
     System.out.println(title1);

}
}
