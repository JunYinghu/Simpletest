package com.google;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.DriverManager;
import utils.Log;


public class BaseTest {

    WebDriver driver;

    @BeforeSuite
    public void setup() {
        Log.startLog("Testing is starting");
        driver = new DriverManager().getDriver();
        driver.manage().window().maximize();
    }

  /*  @AfterSuite
    public void teardown() {
        Log.endLog("Testing is end");
        driver.quit();
    }*/
}
