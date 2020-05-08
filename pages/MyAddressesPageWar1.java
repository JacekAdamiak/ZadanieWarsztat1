package cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

//  Klasa opisująca stronę "Your Addresses"
public class MyAddressesPageWar1 {
    private static WebDriver driver;

//    link "+ Create new address"
    @FindBy(xpath = "//*[@data-link-action='add-address']")
    WebElement createNewAddressWar1;

//    Komunikat informujący o udanym dodaniu adresu
    @FindBy(css = ".alert.alert-success")
    WebElement addressSuccessfullyAddedWar1;

//    Lista adresów wyświetlanych na stronie "Your Addresses"
    @FindBy(xpath = "//*[@class='address-body']/address")
    List<WebElement> addressesListWar1;

//    Lista przycisków "Update" wyświetlanych na stronie "Your Addresses"
    @FindBy(xpath = "//*[@data-link-action='edit-address']")
    List<WebElement> updateAddressesListWar1;

//    Lista przycisków "Delete" wyświetlanych na stronie "Your Addresses"
    @FindBy(xpath = "//*[@data-link-action='delete-address']")
    List<WebElement> deleteAddressesListWar1;


    public MyAddressesPageWar1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    Kliknięcie w link "+ Create new address" i przejście do strony adresu
    public void addNewAddressWar1() {
        createNewAddressWar1.click();
    }

//    Zwraca treść komunikatu informującego o udanym dodaniu adresu
    public String getAddressSuccessfullyAddedInfoWar1() {
        return addressSuccessfullyAddedWar1.getText();
    }

//    Zwraca liczbę zapisanych adresów
    public int getNumberOfAddresses() {
        return addressesListWar1.size();
    }

//    Zwraca w formie tekstu cały ostatni adres
    public String getLastAddress () {
        int lastAddress = addressesListWar1.size()-1;
        return addressesListWar1.get(lastAddress).getText();
    }

//    Klika przycisk "Update" w ostatnim adresie - przechodzi do strony adresu
    public void updateLastAddress() {
        int lastAddress = addressesListWar1.size()-1;
        updateAddressesListWar1.get(lastAddress).click();
    }

//    Klika przycisk "Delete" w ostatnim adresie - usuwa go
    public void deleteLastAddress() {
        int lastAddress = addressesListWar1.size()-1;
        deleteAddressesListWar1.get(lastAddress).click();
    }
}
