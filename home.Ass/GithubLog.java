package home.ass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GithubLog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://github.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("login_field")).sendKeys("prasanth8121922058@gmail.com");
		driver.findElement(By.id("password")).sendKeys("hdsfdsfhsdfdfj");
	driver.findElement(By.name("commit")).click();
	
	}

}

