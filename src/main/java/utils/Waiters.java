package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static common.Config.DEFAULT_TIMEOUT;


public class Waiters {

    private final WebDriver driver;

    public Waiters(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement waitElementIsVisible(WebElement element) {
        return new  WebDriverWait(driver, DEFAULT_TIMEOUT).until(ExpectedConditions.visibilityOf(element));
    }
}
