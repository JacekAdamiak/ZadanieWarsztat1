package cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//  Klasa opisująca stronę użytkownika "Your Account"
public class MyAccountPageWar1 {
    private static WebDriver driver;

//    Kafelek "INFORMATION"
    @FindBy(id = "identity-link")
    WebElement informationButtonWar1;

//    Kafelek "ADDRRESS"
    @FindBy(id = "addresses-link")
    WebElement addressesButtonWar1;

    public MyAccountPageWar1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    Kliknięcie w kafelek i przejście do strony "INFORMATION"
    public void goToInformationPageWar1() {
        informationButtonWar1.click();
    }

//    Kliknięcie w kafelek i przejście do strony "ADDRRESS"
    public void goToAddressPageWar1() {
        addressesButtonWar1.click();
    }
}
