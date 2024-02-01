package Practice;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class FirstPracticeSelenium {
    public static void main(String[] args) throws InterruptedException{
        // navigate to retail app
        // enter keyword to search and click on search button
        // quit browser



      //  driver.get("https://bbc.com");
     // driver.get("https://dev.insurance.tekschool-students.com/");


      // Apply Implicit Wait
      // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

      // Apply Explicit Wait language

       // driver.get("https://retail.tekschool-students.com/selenium/dropdown");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
       // driver.get("https://retail.tekschool-students.com/selenium/inputs");
        //driver.get("https://retail.tekschool-students.com/selenium/iframe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
      //  By rangeLocator = By.id("rangeInput");
       // WebElement rangeElement = wait.until(ExpectedConditions.visibilityOfElementLocated(rangeLocator));
        //for (int i = 0; i < 20; i++){
           // rangeElement.sendKeys(Keys.ARROW_RIGHT);
       // }
       //String mainText = driver.findElement(By.id("title")).getText();
       // System.out.println(mainText);
        driver.findElement(By.linkText("Test Selenium")).click();
        Set<String> tabs = driver.getWindowHandles();
        for (String tab : tabs){
            System.out.println(tab);
        }
        driver.findElement((By.linkText("Inputs"))).click();

        }
}
















