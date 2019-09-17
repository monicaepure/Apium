package Fragments;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FirstPageFragment {
    AndroidDriver<MobileElement> driver ;
    public List<MobileElement> buttomButtons;
    public MobileElement dismissButton;
    public MobileElement dismissNewsButton;
    public MobileElement searchBar;
    public MobileElement adsButton;
    public MobileElement saved;
    public MobileElement messagesButton;
    public MobileElement myAccountButton;
    public MobileElement filterButton;


    public FirstPageFragment(AndroidDriver<MobileElement> driver){
        this.driver = driver;
    }

    public void initiElement(){
        dismissButton = driver.findElement(By.id("com.tapptitude.imobiliare:id/textViewShowCaseClose"));
        buttomButtons = driver.findElements(By.id("com.tapptitude.imobiliare:id/bottom_navigation_item_title"));
        dismissNewsButton = driver .findElement(By.id("com.tapptitude.imobiliare:id/closeIB"));
        searchBar = driver.findElement(By.id("com.tapptitude.imobiliare:id/location_container_cv"));
        filterButton = driver.findElement(By.id("com.tapptitude.imobiliare:id/filter_tv"));
        adsButton = buttomButtons.get(0);
        saved = buttomButtons.get(1);
        messagesButton = buttomButtons.get(2);
        myAccountButton = buttomButtons.get(3);
    }

    public void clickSavedAds(){
        this.saved.click();
    }

    public void clickMessages(){
        this.messagesButton.click();
    }

    public void clickMyAccount(){
        this.myAccountButton.click();
    }

    public void dismissTheHelp(){
        this.dismissButton.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        this.dismissButton.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        this.dismissButton.click();
    }
    public void dismissNews (){
        this.dismissNewsButton.click();
    }
}
