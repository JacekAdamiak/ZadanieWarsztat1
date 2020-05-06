package cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HeaderWar1 {
    private static WebDriver driver;


    @FindBy(xpath = "//a[@class='account']")
//    @FindBy(xpath = "//*[@id=\"_desktop_user_info\"]/div/a[2]/span")
            WebElement userNameWar1;

    public HeaderWar1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getLoggedWar1() {
        return userNameWar1.getText();
    }


    public void goToUserInformationViewWar1() {
        userNameWar1.click();
    }


}
