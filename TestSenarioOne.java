package testing.sec;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class TestSenarioOne {
    public static void main(String[] args) {
       
       
        WebDriver driver = new ChromeDriver();

        
            // For opening URL
            driver.get("https://www.lambdatest.com/selenium-playground");
            driver.manage().window().maximize();

            // For Click on "SimpleFormDemo" link
            driver.findElement(By.xpath("//a[text()='Simple Form Demo']")).click();
            
 
            // For Validate that the URL 
           driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
            String currentUrl = driver.getCurrentUrl();
            if (currentUrl.contains("https://www.lambdatest.com/selenium-playground/simple-form-demo'")) {
                System.out.println("URL validation passed! Current URL: " + currentUrl);
            } else {
                System.out.println("URL validation failed.");
            }

            //  For Create a variable for the string value
            String message = "Welcome to LambdaTest";

            // For Entering the value into the  text box
           
            driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']")).sendKeys("Welcome to LambdaTest");

            //For  Click the "Get Checked Value" button
            
             driver.findElement(By.xpath("//button[@id='showInput']")).click();
           

            //For validating message
            WebElement element = driver.findElement(By.xpath("//p[@id='message']"));
            
               
String xpathValue = element.getText();


System.out.println("The displayed message is: " + xpathValue);

         
if (xpathValue.equals(message)) {
    System.out.println("Message validation passed! Your Message: " + xpathValue);
} else {
    System.out.println("Message validation failed. Displayed message: " + xpathValue);
}
    }}




