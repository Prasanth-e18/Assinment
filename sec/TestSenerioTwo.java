package testing.sec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSenerioTwo {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground");
		 driver.manage().window().maximize();
		
		//For clicking Drag and drop
		
		driver.findElement(By.xpath("//a[text()='Drag & Drop Sliders']")).click();
		
		 // For selecting default value
	WebElement element=	driver.findElement(By.xpath("(//input[@class='sp__range'])[3]"));
		
		
//For increasing the value to 95		
		
		
		Actions actions = new Actions(driver);
        // Perform the drag action
        actions.clickAndHold(element)
                .moveByOffset(215, 0).perform();
                
        
        
 //For validating the value
        WebElement Value = driver.findElement(By.xpath("(//input[@class='sp__range'])[3]"));
        String displayedValue = Value.getText();
		
		
       if ("95".equals(displayedValue)) {
            System.out.println("Slider value validated successfully! " );
       } else {
            System.out.println("Slider value validation failed.");
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
