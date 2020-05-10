package pageLibrary;


import utils.PropetiesReader;

import java.util.Properties;

public class MainPageManager {
    private static Object lock = new Object();

    private static MainPageManager instance;

    private String searchInputXpath;
    private String webLink;

    public static MainPageManager getInstance(){
        if (instance ==null){
            synchronized (lock){
                instance = new MainPageManager();
                instance.loadData();
            }
        }
        return instance;
    }

    private void loadData(){
        PropetiesReader propertiesReader = new PropetiesReader();
        Properties propertiesReadElem = propertiesReader.readElemProp();

        searchInputXpath = propertiesReadElem.getProperty("searchInputCss");
        webLink = propertiesReadElem.getProperty("testedweblink");


    }

    public String getSearchInputXpath(){
        return searchInputXpath;
    }

    public String getwebLink(){
        return webLink;
    }

}
