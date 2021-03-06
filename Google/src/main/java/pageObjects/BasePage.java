package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public  WebDriver driver;
    private final WebDriverWait wait;

    BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,15);

    }

    void waitVisibility (By elementBy){
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    void keyinText(By elementBy, String enterText){
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(enterText);

    }

}
