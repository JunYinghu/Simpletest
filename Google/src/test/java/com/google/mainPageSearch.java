package com.google;

import org.testng.annotations.Test;
import pageObjects.MainPage;

public class mainPageSearch extends BaseTest {

    String testingKeywords = "Testing";

    @Test
    public void searchAnyKey() {
        MainPage mainPage = new MainPage(driver);
        mainPage.getTestWebLink();
        mainPage.keyInSearchKeyword(testingKeywords);

    }
}
