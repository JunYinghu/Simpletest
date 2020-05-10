package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageLibrary.MainPageManager;


public class MainPage extends BasePage {


    private String testWebLink = MainPageManager.getInstance().getwebLink();

    public MainPage(WebDriver driver) {
        super(driver);
    }


    public void getTestWebLink() {
        driver.get(testWebLink);
    }


    public void keyInSearchKeyword(String testingKeywords) {
        keyinText(By.cssSelector(MainPageManager.getInstance().getSearchInputXpath()), testingKeywords);
    }

    public void clickOnButton(){
        
    }
}
