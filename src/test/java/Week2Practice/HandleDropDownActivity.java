package Week2Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownActivity {
    public static void main(String[] args) throws InterruptedException{
        // navigate to https://tek-retail-ui.azurewebsites.net/selenium/dropdown
        // select from country dropdown and language dropdown
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        By countryDropdown = By.cssSelector("select#countrySelect");
        WebElement countryDropDownElement = driver.findElement(countryDropdown);
        Select countrySelect = new Select(countryDropDownElement);
        countrySelect.selectByVisibleText("Afghanistan");
        Thread.sleep(2000);
        By languageDropdown = By.cssSelector("select#languageSelect");
       WebElement languageDropDownElement = driver.findElement(languageDropdown);

        Select languageSelect = new Select(languageDropDownElement);
        languageSelect.selectByValue("Persian");

    }
}
