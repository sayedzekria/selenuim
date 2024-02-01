package Week2Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {
    public static void main(String[] args) throws InterruptedException{
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");
        driver.manage().window().maximize();
        Thread.sleep(2000);
       By programmingDropdownLocator = By.cssSelector("select#programmingLanguageSelect");
       WebElement programmingElement = driver.findElement(programmingDropdownLocator);
        // If the element tag is <select></select> then we can use select class in selenium to interact with dropdown.
        Select programmingSelect = new Select(programmingElement);
        // first type - select using visible text of drop down.
        // Ex - programmingSelect.selectByVisibleText("C++");
        // second type - select using text of value attribute in option tag for drop down
        // Ex-  programmingSelect.selectByValue ("golang").
        // third - select using index number of drop down options
        // ex -
        programmingSelect.selectByIndex(4);
    }
}
