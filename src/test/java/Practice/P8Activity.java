package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8Activity {
    // Navigate to retail App. and click on sign in
    // enter any email and password and click on login
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        driver.manage().window().maximize();
        By clickSignIn = By.linkText("Sign in");
        WebElement clickElement = driver.findElement(clickSignIn);
        clickElement.click();
         By searchInputLocator = By.name("email");
         WebElement searchInputElement = driver.findElement(searchInputLocator);
         searchInputElement.sendKeys("zekria@hotmail.com");
        By searchIdInputLocator = By.id("password");
        WebElement searchIdInputElement = driver.findElement(searchIdInputLocator);
        searchIdInputElement.sendKeys("Takhar123@");
        By searchloginLocator = By.id("loginBtn");
        WebElement LoginBtnElement = driver.findElement(searchloginLocator);
        LoginBtnElement.click();

    }
}
