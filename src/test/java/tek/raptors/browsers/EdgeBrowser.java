package tek.raptors.browsers;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("http:///google.com");
        driver.quit();

    }
}
