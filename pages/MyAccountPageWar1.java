package cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPageWar1 {
    private static WebDriver driver;

    @FindBy(id = "identity-link")
    WebElement informationButtonWar1;

    @FindBy(id = "addresses-link")
    WebElement addressesButtonWar1;

    public MyAccountPageWar1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToInformationPageWar1() {
        informationButtonWar1.click();
    }

    public void goToAddressPageWar1() {
        addressesButtonWar1.click();
    }




}
