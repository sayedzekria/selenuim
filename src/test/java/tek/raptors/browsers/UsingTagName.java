package tek.raptors.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.ClientInfoStatus;
import java.util.List;

public class UsingTagName {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.bbc.com");
        By linksLocator= By.tagName("a");
        List <WebElement> linkElements = driver.findElements(linksLocator);
        System.out.println("number of link" + linkElements.size());
        for (WebElement link: linkElements){
            System.out.println(link.getText());
        }

    }
}
