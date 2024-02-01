package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class wait {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
      //  driver.get("https://tek-retail-ui.azurewebsites.net/");
        // Apply Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
//        driver.findElement(By.linkText("Sign in")).click();
//        driver.findElement(By.name("email")).sendKeys("sayed@tekschool.us");
//        driver.findElement(By.id("password")).sendKeys("Takhar121331@");
//        driver.findElement(By.id("loginBtn")).click();
        // apply Explicit wait
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
////        By searchSignInLocator = By.linkText("Sign in");
////        WebElement signInElement = wait.until(ExpectedConditions.elementToBeClickable(searchSignInLocator));
////        signInElement.click();
////       By nameLocator = By.name("email");
////      WebElement nameElement = wait.until(ExpectedConditions.presenceOfElementLocated(nameLocator));
//      nameElement.sendKeys("sayed@tekschool.us");
//      By idLocator = By.id("password");
//     WebElement idElement = wait.until(ExpectedConditions.visibilityOfElementLocated(idLocator));
//     idElement.sendKeys("Takhar121331@");
//    By LogInBtnLocator = By.id("loginBtn");
//   WebElement btnLoginElement = wait.until(ExpectedConditions.elementToBeClickable(LogInBtnLocator));
//   btnLoginElement.click();
        // navigate to https://tek-retail-ui.azurewebsites.net/selenium/dropdown
        // select value from any of those dropdowns
        // apply Implicit and explicit to your element.
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");
        // Apply Implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();






    }
}
