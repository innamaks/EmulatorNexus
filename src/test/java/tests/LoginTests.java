package tests;

import config.AppiumConfig;
import org.testng.annotations.Test;
import screens.SplashSgreen;

public class LoginTests extends AppiumConfig {

    @Test
    public void LoginSuccess(){
        new SplashSgreen(driver)
                .checkVersion("1.0.0")
                .fillEmail("innayrchenko77@gmail.com")
                .fillPassword("AlisMaksim2!")
                .submitLogin();
    }



}
