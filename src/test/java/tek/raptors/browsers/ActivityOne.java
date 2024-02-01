package tek.raptors.browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityOne {
    public static void main(String[] args) {
        // Open Chrome and navigate to facebook.com
        ChromeDriver chrome = new ChromeDriver();
        chrome.get("http://facebook.com");
        String title = chrome.getTitle();
        System.out.println(title);
        chrome.quit();

    }
}
