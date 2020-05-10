package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropetiesReader {
    public Properties readElemProp() {
        Properties elemProp = new Properties();
        try {
            String loadInfo = "Configuration properties loaded successfully";
            String propertiesFilePath = new ConstantVar().getPropertiesPath();
            elemProp.load(new FileInputStream(propertiesFilePath));
            Log.info(loadInfo);
        } catch (Exception e) {
            String noFoundErr = "Configuration properties loaded failure";
            Log.error(noFoundErr);
        }
        return elemProp;
    }
}
