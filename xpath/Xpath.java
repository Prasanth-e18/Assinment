package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {

	public static void main (String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		
//For username field use attribute based X-path
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
// For Password field use attribute based xpath
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
// For clicking login button use attribute based xpath	
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
// For  clicking CRM/s button use attributed based xpath
	driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
// For clicking leads use text based x-path	
		driver.findElement(By.xpath("//a[text()='Leads']")).click(); 
// For clicking Create Lead	use text based xpath	
	driver.findElement(By.xpath("//a[text()='Create Lead']")).click(); 
// For company name field use attribute based xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
// For 	First name 	field use attribute based xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("e");
// For last name field use 	attribute based xpath	
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("prasanth");
// For Selecting value as Employee use attribute based xpath
		Thread.sleep(1000);
		WebElement source = driver.findElement(By.xpath("//select[@name='dataSourceId']"));
	    Select obj = new Select(source);
	    obj.selectByVisibleText("Employee");
	    Thread.sleep(1000);
// For Selecting value as Pay Per Click Advertising in MarknId by Use attribute based xpath
	    
		WebElement source1=driver.findElement(By.xpath("//select[@name='marketingCampaignId']"));
		Select obj1=new Select(source1);
		obj1.selectByValue("9001");
		 Thread.sleep(1000);
// For Selecting value as Corporation in OwnerShip field Use attribute xpath
		
		WebElement source2=driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']"));
		Select obj2=new Select(source2);
		obj2.selectByIndex(5);
		 Thread.sleep(1000);
//  For Selecting value as India in Country Field Use attribute based xpath
		
		WebElement source3=driver.findElement(By.xpath("//select[@name='generalCountryGeoId']"));
		Select obj3=new Select(source3);
		obj3.selectByVisibleText("India");
		 Thread.sleep(1000);
// For Clicking on create Lead Button use attribute based xpath
		 driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		 Thread.sleep(1000);
// For deleting lead use text base xpath
		 driver.findElement(By.xpath("//a[text()='Delete']")).click();
		 
 // To Getting the Title of the resulting Page

		 String title1 = driver.getTitle();
	     System.out.println(title1);
	     
	}
	
	
}

