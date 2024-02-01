package tek.raptors.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        By searchIdLocator = By.id("APjFqb");
        WebElement searchIdElement = driver.findElement(searchIdLocator);
        searchIdElement.sendKeys("what time is now");
       By searchButtonLocator = By.name("btnK");
       WebElement searchButtonElement = driver.findElement(searchButtonLocator);
       searchButtonElement.click();

    }
}
