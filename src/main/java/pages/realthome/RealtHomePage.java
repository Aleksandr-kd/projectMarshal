package pages.realthome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;


public class RealtHomePage extends BasePage<RealtHomePage> {
    public RealtHomePage(WebDriver driver) {
        super(driver);
    }

    By countRooms = By.xpath("//span[text()='Кол-во комнат']");
    By optionRooms = By.xpath("//div[text()='2к квартира']");
    By searchBtn = By.xpath("//div[@class='flex justify-end']" +
            "//span[@class='flex items-center justify-center h-min']");

    public RealtHomePage enterCountRooms() {
        $(countRooms).click();
        $(optionRooms).click();
        return this;
    }

    public RealtHomePage clickToSearch(){
        $(searchBtn).click();
        return this;
    }

}
