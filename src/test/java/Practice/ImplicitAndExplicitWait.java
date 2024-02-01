package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;

public class ImplicitAndExplicitWait {
    public static void main(String[] args) throws InterruptedException {
        // navigate to retail app
        // apply Implicit wait
        //select value from those dropdowns
        //apply implicit and explicit wait to your element

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
       By languageProgrammingDDLocator = By.cssSelector("select#programmingLanguageSelect");
        WebElement programmingSelect = wait.until(ExpectedConditions.visibilityOfElementLocated(languageProgrammingDDLocator));
        Select select = new Select(programmingSelect);
        select.selectByVisibleText("Erlang");
        Thread.sleep(3000);
        By countryDDLocator = By.cssSelector("select#countrySelect");
       WebElement countrySelectElement = wait.until(ExpectedConditions.visibilityOfElementLocated(countryDDLocator));
       Select select1 = new Select(countrySelectElement);
       select1.selectByValue("Cuba");
       Thread.sleep(3000);
       // handling multiple element with wait
        By OptionLocatorElement = By.cssSelector("select#countrySelect option");
        List<WebElement> optionElement =  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(OptionLocatorElement));
        for (WebElement element : optionElement){
            System.out.println(element.getText());
            Thread.sleep(3000);
            // handleDropDownWithoutSelect




        }




    }
}
