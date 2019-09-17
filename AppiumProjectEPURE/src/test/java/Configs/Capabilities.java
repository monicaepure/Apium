package Configs;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Capabilities {
    public AndroidDriver getLocalDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "bullhead");
        capabilities.setCapability("udid", "0109b7653f5f9273");
        capabilities.setCapability("app", "C:\\Users\\mepure\\imobiliare.apk");
        capabilities.setCapability("appPackage", "com.tapptitude.imobiliare");
        capabilities.setCapability("appActivity", "com.tapptitude.imobiliare.ui.activity.MainActivity");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "Appium");
        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(url,capabilities);
        return driver;


    }
}
