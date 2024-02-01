package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {
    public static void main(String[] args)throws InterruptedException {
        //-- navigate to insurance app.
        //click on create new account fill the form and create account.
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dev.insurance.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //driver.findElement(By.linkText("Login")).click();
        //driver.get("https://tek-retail-ui.azurewebsites.net/");
        //driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");
        By SearchCreateNewAccount = By.xpath("/html/body/div[1]/div/div[2]/div/div/a/span");
       WebElement searchNewAccountElement = driver.findElement(SearchCreateNewAccount);
       searchNewAccountElement.click();

        Thread.sleep(3000);
        driver.findElement(By.name("email")).sendKeys("mustafa@tekchoo.us");
        driver.findElement(By.name("firstName")).sendKeys("zekria");
        driver.findElement(By.id("gender")).sendKeys("MALE");
        driver.findElement(By.id("employmentStatus")).sendKeys("Software Engineer");
        driver.findElement(By.name("title")).sendKeys("Mr.");
        driver.findElement(By.name("lastName")).sendKeys("habibi");
        driver.findElement(By.id("maritalStatus")).sendKeys("Single");
        driver.findElement(By.id("dateOfBirth")).sendKeys("02022023");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[2]/button[1]")).click();



    }
}
