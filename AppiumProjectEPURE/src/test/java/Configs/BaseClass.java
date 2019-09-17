package Configs;

import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;

import java.net.MalformedURLException;

public class BaseClass extends Capabilities {
    public AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = getLocalDriver();
    }

    @After
    public void tearDown(){
//        driver.quit();
    }

}
