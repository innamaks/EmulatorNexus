package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class SplashSgreen extends BaseScreen{
    public SplashSgreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/version_text']")
    MobileElement versionTextView;


    public String getVersionText(){
        return versionTextView.getText();
    }



    public AuthenticationScreen checkVersion(String version){
        return new AuthenticationScreen(driver);
    }
}
