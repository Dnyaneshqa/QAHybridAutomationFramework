package utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.IOException;

public class ConfigReader {
    private static Properties properties;
    static{
        try{
            FileInputStream fis = new FileInputStream("./src/main/resources/config/config.properties");
            properties = new Properties();
            properties.load(fis);
        }catch(Exception e){
            throw new RuntimeException("Could not read config file. ", e);
        }
    }
    public static String get(String key){
        return properties.getProperty(key);
    }
}
