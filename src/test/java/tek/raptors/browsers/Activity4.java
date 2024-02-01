package tek.raptors.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4 {
    public static void main(String[] args) {
        // navigate to https://tek-retail-ui.azurewebsites.net/
        // enter Keyword to search and click on search button
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        By searchIdLocator = By.id("searchInput");
        WebElement searchIdElement = driver.findElement(searchIdLocator);
        searchIdElement.sendKeys("TV");
        By searchButtonLocator = By.id("searchBtn");
        WebElement searchButtonElement = driver.findElement(searchButtonLocator);
        searchButtonElement.click();
        
    }
}
