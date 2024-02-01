package tek.raptors.browsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Activitytwo {
    public static void main(String[] args) {
        FirefoxDriver dirver = new FirefoxDriver();
        dirver.get("http:///facebook.com");
        dirver.quit();
    }
}
