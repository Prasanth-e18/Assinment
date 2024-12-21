package shdo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sukgu.Shadow;

public class ShdOwss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver =new ChromeDriver();
driver.get("https://dev186929.service-now.com/\r\n");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("2AqjN!lC2!Vy");
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		
		Shadow shadow=new Shadow(driver);
		shadow.setImplicitWait(10);
		//for clicking all field
		shadow.findElementByXPath("//div[text()='All']").click();
		//for selecting catalog 
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//span[@class='item-icon']").click();
		shadow.setImplicitWait(10);
	
		shadow.findElementByXPath("//img[@class='now-avatar-img']").click();
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("/div[@class='user-menu-label polaris-enabled']").click();
	}

}
