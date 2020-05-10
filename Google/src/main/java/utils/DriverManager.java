package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {

    private WebDriver driver;

    public WebDriver getDriver() {
        if (driver == null) driver = createDriver();
        return driver;
    }

    public WebDriver createDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("--headless");
        System.setProperty("webdriver.chrome.driver", ConfigData.getDriverPath());
       // driver = new ChromeDriver(options);

        // to show ui
          driver = new ChromeDriver();

        return driver;

    }
}
