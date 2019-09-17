package Fragments;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class NewAccountFragments {
    AndroidDriver<MobileElement> driver ;
    public MobileElement logo;
    public MobileElement title;
    public MobileElement emailField;
    public MobileElement nameField;
    public MobileElement signupButton;
    public MobileElement agreeTermsButton;
    public MobileElement agreeForSure;


    public NewAccountFragments(AndroidDriver<MobileElement> driver){
        this.driver = driver;
    }

    public void initiElement() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        logo = driver.findElement(By.id("com.tapptitude.imobiliare:id/al_iv_logo"));
        title = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]"));
        emailField = driver.findElement(By.id("com.tapptitude.imobiliare:id/fr_et_email"));
        nameField = driver.findElement(By.id("com.tapptitude.imobiliare:id/fr_et_name"));
        signupButton = driver.findElement(By.id("com.tapptitude.imobiliare:id/fr_btn_signup"));
        agreeTermsButton = driver.findElement(By.id("com.tapptitude.imobiliare:id/fr_tv_terms"));

    }

    public void createNewUser(String email, String name) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        this.emailField.sendKeys(email);
        this.nameField.sendKeys(name);
        this.agreeTermsButton.click();
        agreeForSure = driver.findElement(By.id("com.tapptitude.imobiliare:id/accept_btn"));
        agreeForSure.click();
        agreeForSure.click();
        agreeForSure.click();
        Thread.sleep(1000);
        this.signupButton.click();
    }


}
