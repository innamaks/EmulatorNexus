package tests;

import config.AppiumConfig;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.SplashSgreen;

public class LaunchTest extends AppiumConfig {


    @Test
    public void LaunchTest() {

        String version = new SplashSgreen(driver)
                .getVersionText();
        System.out.println(version);
        Assert.assertTrue(version.contains("1.0.0"));

    }
}
