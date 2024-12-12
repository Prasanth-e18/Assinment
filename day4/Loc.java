package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loc {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(1000);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/S")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("E");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prasanth");
	driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
	driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
	driver.findElement(By.name("submitButton")).click();
		
	    
	 
		
		// TODO Auto-generated method stub

	}

}
