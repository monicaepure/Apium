package Fragments;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class MyAccountFragment {
    AndroidDriver<MobileElement> driver ;
    public MobileElement editProfile;
    public MobileElement editProfileTitle;

    public MyAccountFragment(AndroidDriver<MobileElement> driver){
        this.driver = driver;
    }

    public void initiElement() {
        editProfile = driver.findElement(By.id("com.tapptitude.imobiliare:id/profile_rl"));
        editProfileTitle = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView"));

    }

     public String profileTitle(){

        return this.editProfileTitle.getText();
    }
}
