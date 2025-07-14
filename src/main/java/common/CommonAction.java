package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import static common.Config.BROWSER;
import static common.Config.IMPLICITLY_WAIT;


public class CommonAction {
    private static WebDriver driver = null;

    private CommonAction() {
    }

    public static WebDriver createDriver() {
        if (driver == null) {
            switch (BROWSER) {
                case "yandex":
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/yandexdriver.exe");
                    ChromeOptions options = new ChromeOptions();
                    options.setBinary("C:/Users/ASArutyunyan/AppData/Local/Yandex/YandexBrowser/Application/browser.exe");
                    driver = new ChromeDriver(options);
                    break;
                case "chrome":
                    ChromeOptions chromeOptions = new ChromeOptions();
                    driver = new ChromeDriver(chromeOptions);
                    break;
                default:
                    Assert.fail("Не верный браузер " + BROWSER);
            }
            driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT);
            driver.manage().window().maximize();
        }
        return driver;
    }
}
