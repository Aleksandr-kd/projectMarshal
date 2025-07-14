package pages.base;

import common.AbsCommon;
import org.openqa.selenium.WebDriver;


public class BasePage<T> extends AbsCommon {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void open(String url) {
        driver.get(url);
    }
}