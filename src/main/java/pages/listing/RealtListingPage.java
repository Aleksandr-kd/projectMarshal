package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;


public class RealtListingPage extends BasePage<RealtListingPage> {

    public RealtListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//div[@class='sm:w-full w-full p-1.5 sm:p-2.5']");

    public void checkCountCards() {
        int countCard = waiters.waitElementIsVisible($(card)).findElements(card).size();

        Assert.assertEquals(countCard, 30);
    }
}