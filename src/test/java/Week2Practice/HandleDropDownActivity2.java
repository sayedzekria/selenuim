package Week2Practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownActivity2 {
    public static void main(String[] args) throws InterruptedException{
        // write a method that takes element for select and always select last option
        // then in main method call your method and test it
        ChromeDriver driver = new ChromeDriver();
        driver.get("navigate to https://tek-retail-ui.azurewebsites.net/selenium/dropdown");
        driver.manage().window().maximize();
        Thread.sleep(2000);


        }
    public static void selectLastOption(WebElement Element) {
        Select select = new Select(Element);
    }
}
