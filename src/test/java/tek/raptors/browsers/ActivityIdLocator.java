package tek.raptors.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActivityIdLocator {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        By searchInputLocator = By.id("APjFqb");
        WebElement searchInputElement =  driver.findElement(searchInputLocator);
        searchInputElement.sendKeys("how many states does the united state have");

    }
}
