package tek.raptors.browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningChrome {
    public static void main(String[] args) {
        // create an object of a selenium class ChromeDriver
        ChromeDriver chrome = new ChromeDriver();
        // get() method navigation to url
        chrome.get("https://google.com");
        // every time we run it open the browser, how to close it
        // quit(). quit() method will close all the open tabs and browser.
        chrome.quit();
    }
}
