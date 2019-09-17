package Tests;

import Configs.BaseClass;
import Configs.CreatingNewUser;
import Fragments.FirstPageFragment;
import Fragments.LoginFragment;
import Fragments.MyAccountFragment;
import Fragments.NewAccountFragments;
import org.junit.Assert;
import org.junit.Test;

public class CreateAccountTests extends BaseClass {
    @Test
    public void checkPageContents() {
        FirstPageFragment firstPageFragment = new FirstPageFragment(driver);
        firstPageFragment.initiElement();
        firstPageFragment.dismissTheHelp();
        firstPageFragment.dismissNews();
        firstPageFragment.clickMyAccount();
        LoginFragment loginFragment = new LoginFragment(driver);
        loginFragment.initiElement();
        loginFragment.clickOnCreateAccount();
        NewAccountFragments newAccountFragments = new NewAccountFragments(driver);
        newAccountFragments.initiElement();
        Assert.assertTrue(newAccountFragments.logo.isDisplayed());
        Assert.assertTrue(newAccountFragments.emailField.isDisplayed());
        Assert.assertTrue(newAccountFragments.nameField.isDisplayed());
        Assert.assertTrue(newAccountFragments.title.getText().equals("Creează cont, simplu și rapid"));
        Assert.assertTrue(newAccountFragments.signupButton.getText().equals("Creează cont"));
        Assert.assertTrue(newAccountFragments.agreeTermsButton.getText().equals("Sunt de acord cu Termenii și condițiile și Politica de confidențialitate Imobiliare.ro"));
    }

    @Test
    public void checkCreatingAnUser() throws InterruptedException {

        FirstPageFragment firstPageFragment = new FirstPageFragment(driver);
        firstPageFragment.initiElement();
        firstPageFragment.dismissTheHelp();
        firstPageFragment.dismissNews();
        firstPageFragment.clickMyAccount();

        LoginFragment loginFragment = new LoginFragment(driver);
        loginFragment.initiElement();
        loginFragment.clickOnCreateAccount();

        CreatingNewUser creatingNewUser = new CreatingNewUser();
        NewAccountFragments newAccountFragments = new NewAccountFragments(driver);
        newAccountFragments.initiElement();
        newAccountFragments.createNewUser(creatingNewUser.getFirstName()+"@mailinator.com",creatingNewUser.getFirstName());

        MyAccountFragment myAccountFragment = new MyAccountFragment(driver);
        myAccountFragment.initiElement();

        Assert.assertTrue(myAccountFragment.profileTitle().equals("Editează profilul"));
    }

}
