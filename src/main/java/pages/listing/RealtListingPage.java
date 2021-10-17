package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

import static constants.Constant.countCard.COUNT_CARDS;

public class RealtListingPage extends BasePage {

    public RealtListingPage(WebDriver webDriver) {
        super(webDriver);
    }

    private final By card = By.xpath("//div[@class='listing-item highlighted']");

    public RealtListingPage checkCountCards () {
        int countCard = webDriver.findElements(card).size();
        Assert.assertEquals(countCard, COUNT_CARDS);

        return this;
    }
}
