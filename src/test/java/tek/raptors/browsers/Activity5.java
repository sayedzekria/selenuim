package tek.raptors.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5 {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.bbc.com");
        // get link from bbc sport side
        // find locator from that
        //By searchLinkLocator = By.linkText("Sport");
        //WebElement searchLinkElement = driver.findElement(searchLinkLocator);
      //  searchLinkElement.click();
        By searchByLinkTextLocator = By.linkText("The Crown: Netflix's royal drama featuring Diana's ghost splits critics");
        WebElement searchByLinkElement = driver.findElement(searchByLinkTextLocator);
        searchByLinkElement.click();
    }
}
