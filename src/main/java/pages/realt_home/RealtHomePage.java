package pages.realt_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class RealtHomePage extends BasePage {

    public RealtHomePage(WebDriver webDriver) {
        super(webDriver);
    }

    private final By countRooms = By.id("rooms");
    private final By option2rooms = By.xpath("//select[@id='rooms']/option[@value='2']");
    private final By findBtn = By.xpath("//div[@id='residentialInputs']//a[text()='Найти']");

    public RealtHomePage enterCountRooms() {
        webDriver.findElement(countRooms).click();
        webDriver.findElement(option2rooms).click();

        return this;
    }

    public RealtHomePage clickToFind () {
        WebElement btnFind = webDriver.findElement(findBtn);
        btnFind.click();

        return this;
    }


}
