package Fragments;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SavedAdsFragment {
    AndroidDriver<MobileElement> driver ;
    public MobileElement title;

    public SavedAdsFragment(AndroidDriver<MobileElement> driver){
        this.driver = driver;
    }

    public void initiElement() {
        title = driver.findElement(By.id("com.tapptitude.imobiliare:id/title_tv"));
    }
}