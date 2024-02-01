package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P7UsingLinkText {
    public static void main(String[] args) {
        /*ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.foxnews.com");
        driver.manage().window().maximize();
        By sportLinkTextLocator = By.linkText("Sports");
       WebElement element = driver.findElement(sportLinkTextLocator);
       element.click();

         */
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.foxnews.com");
        driver.manage().window().maximize();
        By linktextLocator = By.linkText("Jonathan Turley at a loss to explain prosecutors' decisions in Hunter Biden investigation");
        WebElement element = driver.findElement(linktextLocator);
        element.click();
    }
}
