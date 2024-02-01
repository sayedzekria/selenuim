package tek.raptors.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity7 {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.partialLinkText("Create New Account")).click();
        driver.findElement(By.name("name")).sendKeys("sayed");
        driver.findElement(By.name("email")).sendKeys("sayed@yahoo.com");
        driver.findElement(By.id("passwordInput")).sendKeys("Tatata123@");
        driver.findElement(By.id("confirmPasswordInput")).sendKeys("Tatata123@");
        driver.findElement(By.id("SignUpBtn")).click();

    }
    // Navigate to tek retail app and goto sign in and create new account.
    // enter name and enter invalid email and print error message for email field


}

