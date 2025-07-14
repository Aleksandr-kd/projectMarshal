package tests.base;

import common.CommonAction;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import pages.base.BasePage;
import pages.listing.RealtListingPage;
import pages.realthome.RealtHomePage;

import java.util.Set;


public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage<Object> basePage = new BasePage<>(driver);
    protected RealtHomePage realtHomePage = new RealtHomePage(driver);
    protected RealtListingPage realtListingPage = new RealtListingPage(driver);

    protected void switchWindow() {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        String window1 = driver.getWindowHandle();

        js.executeScript("window.open()");

        Set<String> currentWindows = driver.getWindowHandles();

        String window2 = null;

        for (String window : currentWindows) {
            if (!window.equals(window1)) {
                window2 = window;
                break;
            }
        }

        driver.switchTo().window(window2);
    }

    @AfterSuite(alwaysRun = true)
    public void quite(){
        driver.quit();
    }
}
