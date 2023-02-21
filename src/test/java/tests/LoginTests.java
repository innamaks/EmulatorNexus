package tests;

import config.AppiumConfig;
import models.Auth;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import screens.AuthenticationScreen;
import screens.ContactListScreen;
import screens.SplashSgreen;

public class LoginTests extends AppiumConfig {

    @Test
    public void LoginSuccess() {
       // boolean res = new SplashSgreen(driver)
               // .checkVersion("Version 1.0.0")
        boolean res=new AuthenticationScreen(driver)
                .fillEmail("innayrchenko77@gmail.com")
                .fillPassword("AlisMaksim2!")
                .submitLogin()
                .isContactListActivityDisplayed();
        Assert.assertTrue(res);

    }

@Test
    public void loginSuccessModel(){
    Auth auth = Auth.builder().email("innayrchenko77@gmail.com").password("AlisMaksim2!").build();

   // boolean res = new SplashSgreen(driver)
           // .checkVersion("Version 1.0.0")
    boolean res=new AuthenticationScreen(driver)
            .fillLoginRegstrationForm(auth)
            .submitLogin()
            .isContactListActivityDisplayed();
    Assert.assertTrue(res);

}

@Test(enabled = false)
public void wrongEmail(){

}
@AfterMethod
    public void postCondition(){
       new ContactListScreen(driver)
               .logout();
}



}
