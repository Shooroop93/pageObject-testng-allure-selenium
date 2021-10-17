package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static common.Config.PLATFORM_AND_BROWSER;
import static constants.Constant.TimeoutVariable.IMPLICIT_WAIT;

public class CommonActions {
    public static WebDriver createDriver() {
        WebDriver webDriver = null;

        switch (PLATFORM_AND_BROWSER) {

            case "win_chrome" :
                webDriver = new ChromeDriver();
                break;
            default:
                Assert.fail("Incorrect platform or browser name" + PLATFORM_AND_BROWSER);
        }
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT , TimeUnit.SECONDS);
        return webDriver;
    }
}
