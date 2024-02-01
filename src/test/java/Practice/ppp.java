package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ppp {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String mainTab = driver.getWindowHandle();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        try {
            By seleniumLinkLocator = By.linkText("Test Selenium");
            wait.until(ExpectedConditions.elementToBeClickable(seleniumLinkLocator)).click();

            for (String tab : driver.getWindowHandles()) {
                if (!tab.equals(mainTab)) {
                    driver.switchTo().window(tab);
                    break;
                }
            }
            wait.until(
                            ExpectedConditions.elementToBeClickable(By.linkText("Drop Down")))
                    .click();
            By selectLocator = By.id("countrySelect");
            WebElement selectElement = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(selectLocator));

            Select select = new Select(selectElement);
            select.selectByIndex(2);

            String selectedValue = wait.until(
                            ExpectedConditions.visibilityOfElementLocated(selectLocator))
                    .getAttribute("value");
            System.out.println(selectedValue);
            driver.close();

        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException("Fail test exception happened");
        } finally {
            driver.quit();
        }
    }
}
