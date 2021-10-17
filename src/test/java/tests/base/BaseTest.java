package tests.base;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.base.BasePage;
import pages.listing.RealtListingPage;
import pages.realt_home.RealtHomePage;

import static common.Config.CLEAR_COOKIES_AND_STORAGE;
import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {

    protected WebDriver webDriver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(webDriver);
    protected RealtHomePage realtHomePage = new RealtHomePage(webDriver);
    protected RealtListingPage realtListingPage = new RealtListingPage(webDriver);

    @AfterTest
    public void clearCookiesAndLocalStorage() {
        if(CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;
            webDriver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite (alwaysRun = true)
    public void close(){
        if (HOLD_BROWSER_OPEN) {
            webDriver.quit();
        }
    }

}
