package utils;

public class ConstantVar {

    String getPropertiesPath(){
        String elemPropPath =System.getProperty("user.dir") + "\\src\\main\\resources\\elements.properties";

        return elemPropPath;
    }

    String getDriverPath(){
        String driverPath = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";

        return driverPath;
    }
}
