package Tests;

import Configs.BaseClass;
import Fragments.FirstPageFragment;
import Fragments.LoginFragment;
import org.junit.Assert;
import org.junit.Test;

public class LoginTests extends BaseClass {
    @Test
    public void checkTextsOnPage(){
        FirstPageFragment firstPageFragment = new FirstPageFragment(driver);
        firstPageFragment.initiElement();
        firstPageFragment.dismissTheHelp();
        firstPageFragment.dismissNews();
        firstPageFragment.clickMyAccount();
        LoginFragment loginFragment = new LoginFragment(driver);
        loginFragment.initiElement();
        Assert.assertTrue(loginFragment.logo.isDisplayed());
        Assert.assertTrue(loginFragment.emailField.isDisplayed());
        Assert.assertTrue(loginFragment.passwordField.isDisplayed());
        Assert.assertTrue(loginFragment.loginButton.getText().equals("Intră în cont"));
        Assert.assertTrue(loginFragment.forgotPassword.getText().equals("Am uitat parola"));
        Assert.assertTrue(loginFragment.createAccount.getText().equals("Nu ai cont? Creează cont!"));
    }

    @Test
    public void loginAUser(){
        LoginFragment loginFragment = new LoginFragment(driver);
        loginFragment.initiElement();
        loginFragment.login("tobius@mailinator.com","DummyPass1234");

    }
}
