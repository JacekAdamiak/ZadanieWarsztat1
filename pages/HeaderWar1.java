package cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//  Klasa obsługująca nagłówek strony
public class HeaderWar1 {
    private static WebDriver driver;

//  Link imię i nazwisko zalogowanego użytkownika
    @FindBy(xpath = "//a[@class='account']")
    WebElement userNameWar1;

    public HeaderWar1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    Metoda pobiera wyświetlany napis imię i nazwisko użytkownika zalogowanego
    public String getLoggedWar1() {
        return userNameWar1.getText();
    }

//  Kliknięcie na link imię i nazwisko użytkownika i
//  przejście do strony "Your Account"
    public void goToUserInformationViewWar1() {
        userNameWar1.click();
    }
}
