package tek.raptors.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Activity8 {
    public static void main(String[] args) {
        // navigate to sign in from tek retail app and print the labels texts
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        driver.findElement(By.linkText("Sign in")).click();
        List<WebElement> labelElements = driver.findElements(By.tagName("label"));
        System.out.println("number of lable" + labelElements.size());
        for (WebElement element : labelElements){
            String text = element.getText();
            System.out.println(text);
        }
        driver.quit();

    }
}
