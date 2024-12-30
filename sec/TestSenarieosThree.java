package testing.sec;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSenarieosThree {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.lambdatest.com/selenium-playground");
	 driver.manage().window().maximize();
	
	//For clicking Input Form submit
	
	driver.findElement(By.xpath("//a[text()='Input Form Submit']")).click();
	
	
	// For clicking Submit button without entering details
	
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
	Thread.sleep(1000);
	
	// For entering mandatory details
	
	//For entering name
	
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("prasanth");
	
	// For entering email
	
	driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("prasanth8121922@gmail.com");
	
	//For entering password
	
	driver.findElement(By.xpath(" //input[@name='password']")).sendKeys("prasanth4455@A");
	
	// For entering company name
	
	driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Thq");
	
	// For entering web site name
	driver.findElement(By.xpath("//input[@id='websitename']")).sendKeys("abc.com");
	
	// For selecting country
	driver.findElement(By.xpath("//option[text()='United States']")).click();
	
	// For entering city
	 driver.findElement(By.xpath("//input[@name='city']")).sendKeys("chennai");
	
	// For entering address 1
		 driver.findElement(By.xpath("//input[@name='address_line1']")).sendKeys("icicibank");
		 
		// For entering  address 2
		 driver.findElement(By.xpath("//input[@name='address_line2']")).sendKeys("br street");
		 
		// For entering state
		 driver.findElement(By.xpath("//input[@id='inputState']")).sendKeys("Tamil nadu");
		 
		// For entering  pin code
		 driver.findElement(By.xpath("//input[@id='inputZip']")).sendKeys("524121");
		 Thread.sleep(1000);
		 
		 //For clicking submit button
		 driver.findElement(By.xpath("//button[text()='Submit']")).click();
		 
		
	
	
	
	
	
	
	
	
	
	
	
	
}
}
