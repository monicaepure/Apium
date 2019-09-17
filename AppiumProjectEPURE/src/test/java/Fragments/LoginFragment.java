package Fragments;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginFragment {
    AndroidDriver<MobileElement> driver ;
    public MobileElement createAccount;
    public MobileElement loginButton;
    public MobileElement emailField;
    public MobileElement passwordField;
    public MobileElement logo;
    public MobileElement forgotPassword;


    public LoginFragment(AndroidDriver<MobileElement> driver){
        this.driver = driver;
    }

    public void initiElement() {
        driver.hideKeyboard();
        createAccount = driver.findElement(By.id("com.tapptitude.imobiliare:id/fl_tv_create_account"));
        loginButton = driver.findElement(By.id("com.tapptitude.imobiliare:id/fl_btn_login"));
        emailField = driver.findElement(By.id("com.tapptitude.imobiliare:id/fl_et_email"));
        passwordField = driver.findElement(By.id("com.tapptitude.imobiliare:id/fl_et_pass"));
        logo = driver.findElement(By.id("com.tapptitude.imobiliare:id/al_iv_logo"));
        forgotPassword = driver.findElement(By.id("com.tapptitude.imobiliare:id/fl_tv_forgot_pass"));
    }
    public void clickOnCreateAccount(){
        this.createAccount.click();
    }
    public void login(String email, String password){
        this.emailField.sendKeys(email);
        this.passwordField.sendKeys(password);
        this.loginButton.click();

    }

}
