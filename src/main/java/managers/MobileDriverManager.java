package managers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.ConfigReader;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileDriverManager {

    private static AppiumDriver driver;

    public static AppiumDriver getDriver() throws MalformedURLException {
        if (driver == null) {
            String platform = ConfigReader.get("mobilePlatform").toLowerCase();
            DesiredCapabilities caps = new DesiredCapabilities();

            if (platform.equals("android")) {
                caps.setCapability("platformName", "Android");
                caps.setCapability("automationName", "UiAutomator2");
                caps.setCapability("deviceName", ConfigReader.get("deviceName"));
                caps.setCapability("app", ConfigReader.get("appPath"));
                driver = new AndroidDriver(new URL(ConfigReader.get("appiumServerUrl")), caps);

            } else if (platform.equals("ios")) {
                caps.setCapability("platformName", "iOS");
                caps.setCapability("automationName", "XCUITest");
                caps.setCapability("deviceName", ConfigReader.get("deviceName"));
                caps.setCapability("app", ConfigReader.get("appPath"));
                driver = new IOSDriver(new URL(ConfigReader.get("appiumServerUrl")), caps);
            }
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
