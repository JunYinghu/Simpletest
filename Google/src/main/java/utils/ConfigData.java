package utils;

public class ConfigData {

    private static String driverPath;


    static void setDriverPath() {
        String chromDriver;
        if (System.getProperty("os.name").contains("Windows")) {
            chromDriver = new ConstantVar().getDriverPath();
        } else
            chromDriver = "chromedriver_mac.exe";

        driverPath = chromDriver;
    }


    static String getDriverPath() {
        setDriverPath();
        return driverPath;

    }
}
