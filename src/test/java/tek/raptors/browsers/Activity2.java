package tek.raptors.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
    public static void main(String[] args) {
        //Navigate to facebook, enter username and password. click on login
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
       By searchNameLocator = By.id("email");
       WebElement searchInputElement = driver.findElement(searchNameLocator);
       searchInputElement.sendKeys("safdadfakdf@gmail.com");
       By searchIdLocator = By.id("pass");
       WebElement searchIdElement = driver.findElement(searchIdLocator);
       searchIdElement.sendKeys("979794jd@");
       By searchByLoginLocator = By.name("login");
       WebElement searchloginElement = driver.findElement(searchByLoginLocator);
       searchloginElement.click();





    }
}
