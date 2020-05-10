package pageObjects;


import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private final WebDriver driver;
    private MainPage mainpage;


    public PageObjectManager (WebDriver driver){
        this.driver = driver;
    }

    public MainPage getMainPageSearch(){
        return (mainpage==null) ? mainpage=new MainPage(driver):mainpage;

    }
}
