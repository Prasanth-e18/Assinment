package home.ass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("prasanth8121922058@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("udfsdfdaj");
	driver.findElement(By.name("login")).click();
	}}


