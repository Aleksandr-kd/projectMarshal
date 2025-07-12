import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/yandexdriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:/Users/ASArutyunyan/AppData/Local/Yandex/YandexBrowser/Application/browser.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://google.com");
        driver.quit();

    }
}