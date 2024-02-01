package tek.raptors.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class Activity6 {
    public static void main(String[] args) {
        // navigate to retail app. and click on sign in
        //enter any email and password (wrong one), and click on it
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        By searchLinkTextLocator = By.linkText("Sign in");
       WebElement searchLinkTextElement = driver.findElement(searchLinkTextLocator);
       searchLinkTextElement.click();
      By searchNameLocator = By.name("email");
      WebElement searchNameElement = driver.findElement(searchNameLocator);
      searchNameElement.sendKeys("sasasa@gmail.com");
      searchNameElement.click();
      By searchIdLocator = By.id("password");
      WebElement searchIdElement =  driver.findElement(searchIdLocator);
      searchIdElement.sendKeys("tatatata1@");
      searchIdElement.click();
   //   By searchClickButtonLocator = By.id("loginBtn");
     // WebElement clickElement = driver.findElement(searchIdLocator);
      //clickElement.click();
        driver.findElement(By.id("loginBtn")).click();




    }
}
