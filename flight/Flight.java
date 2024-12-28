package flight;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flight {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

driver.get("https://www.cheapoair.com/\r\n");
driver.manage().window().maximize();
	//For selecting one way trip
driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]")).click();
//for selecting destination
driver.findElement(By.xpath("(//input[@class='form-control pr-4'])[2]")).click();



driver.findElement(By.xpath("(//input[@class='form-control pr-4'])[2]")).sendKeys(" vijayawada");
driver.findElement(By.xpath("//span[text()=' Vijayawada']")).click();

//for selecting date

driver.findElement(By.xpath("//a[@aria-label='2 January 2025']")).click();
//for selecting adults
driver.findElement(By.xpath("//div[text()='Traveler']")).click();
// for adding adults
driver.findElement(By.xpath("//button[@id='addadults']")).click();
driver.findElement(By.xpath("//button[@id='addadults']")).click();
driver.findElement(By.xpath("//button[@id='addadults']")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//For clicking Done button
driver.findElement(By.xpath("//button[text()='Done']")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//For clicking search button
driver.findElement(By.xpath("//input[@id='searchNow']")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//For clicking cheapest
driver.findElement(By.xpath("//span[text()='Cheapest']")).click();


//Locate all elements with the  XPath and store them in a list
List<WebElement> a = driver.findElements(By.xpath("//span[@class='fpamount fpRoundToFixDecimal']"));

//Iterate through each element in the list
for (int i = 0; i < a.size(); i++) {
 // getting the text from the i-th element
 String text = a.get(i).getText();

//Click the zeroth element 
a.get(0).click();
//for selecting lowest price flight
driver.findElement(By.xpath("//i[@class='arrow arrow-right']")).click();


 // Print the retrieved text
 System.out.println(" Lowest price for one person is "  +  text);
 















}















}}
