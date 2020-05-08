package cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//  Klasa opisująca stronę logowania
public class LoginPageWar1 {
    private static WebDriver driver;

//    Pole do wpisania adresu e-mail
    @FindBy(name = "email")
    WebElement loginInputWar1;

//    Pole do wpisania hasła
    @FindBy(name = "password")
    WebElement passwardInputWar1;

//    Przycisk do logowania "SIGN IN"
    @FindBy(id = "submit-login")
    WebElement signInButtonWar1;

    public LoginPageWar1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    Wprowadzenie danych logowania i zatwierdzenie przyciskiem "SIGN IN"
    public void loginAsWar1(String email, String password) {
        loginInputWar1.click();
        loginInputWar1.clear();
        loginInputWar1.sendKeys(email);

        passwardInputWar1.click();
        passwardInputWar1.clear();
        passwardInputWar1.sendKeys(password);

        signInButtonWar1.click();
    }
}
