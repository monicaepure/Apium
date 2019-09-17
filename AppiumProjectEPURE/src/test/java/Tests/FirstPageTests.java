package Tests;

import Configs.BaseClass;
import Fragments.FirstPageFragment;
import Fragments.MessagesFragment;
import Fragments.SavedAdsFragment;
import org.junit.Assert;
import org.junit.Test;

public class FirstPageTests extends BaseClass {
    @Test
    public void checkSavedAds(){
        FirstPageFragment firstPageFragment = new FirstPageFragment(driver);
        firstPageFragment.initiElement();
        firstPageFragment.dismissTheHelp();
        firstPageFragment.dismissNews();
        firstPageFragment.clickSavedAds();
        SavedAdsFragment savedAdsFragment = new SavedAdsFragment(driver);
        savedAdsFragment.initiElement();
        Assert.assertTrue(savedAdsFragment.title.getText().equalsIgnoreCase("Nu ai anunțuri salvate?"));
    }

    @Test
    public void checkMessages() {
        FirstPageFragment firstPageFragment = new FirstPageFragment(driver);
        firstPageFragment.initiElement();
        firstPageFragment.dismissTheHelp();
        firstPageFragment.dismissNews();
        firstPageFragment.clickMessages();
        MessagesFragment messagesFragment = new MessagesFragment(driver);
        messagesFragment.initiElement();
        Assert.assertTrue(messagesFragment.title.getText().equalsIgnoreCase("Nu ai trimis încă niciun mesaj?"));
    }
}
