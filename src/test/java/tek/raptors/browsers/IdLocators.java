package tek.raptors.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocators {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        //locate the element.
        By searchInputLocator = By.id("APjFqb");
        // ask selenium to find located element.
        WebElement searchInputElement = driver.findElement(searchInputLocator);
        // ask selenium to perform action on the element
        searchInputElement.sendKeys("Tekschool");
    

    }
}
