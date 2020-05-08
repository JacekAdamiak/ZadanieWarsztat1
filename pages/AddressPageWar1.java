package cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

//  Klasa obsługująca stronę adresu
public class AddressPageWar1 {
    private static WebDriver driver;

//    Pole "Alias"
    @FindBy(name = "alias")
    WebElement aliasInputWar1;

//    Pole "Address"
    @FindBy(name = "address1")
    WebElement addressInputWar1;

//    Pole "City"
    @FindBy(name = "city")
    WebElement cityInputWar1;

//    Pole "Zip Code"
    @FindBy(name = "postcode")
    WebElement zipCodeInputWar1;

//    Pole "Phone"
    @FindBy(name = "phone")
    WebElement phoneInputWar1;

//    Przycisk "SAVE"
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/footer/button")
    WebElement saveNewAddressButtonWar1;

//    Link "Addresses"
    @FindBy(xpath = "//*[@itemprop='name']")
    List<WebElement> goToAddressesListLinkWar1;

    public AddressPageWar1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    Wypełnienie pola "Alias"
    public void inputAliasDataWar1(String alias) {
        aliasInputWar1.click();
        aliasInputWar1.clear();
        aliasInputWar1.sendKeys(alias);
    }

//    Wypełnienie pola "Address"
    public void inputAddressDataWar1(String address) {
        addressInputWar1.click();
        addressInputWar1.clear();
        addressInputWar1.sendKeys(address);
    }

//    Wypełnienie pola "City"
    public void inputCityDataWar1(String city) {
        cityInputWar1.click();
        cityInputWar1.clear();
        cityInputWar1.sendKeys(city);
    }

//    Wypełnienie pola "Zip Code"
    public void inputZipDataWar1(String zipCode) {
        zipCodeInputWar1.click();
        zipCodeInputWar1.clear();
        zipCodeInputWar1.sendKeys(zipCode);
    }

//    Wypełnienie pola "Phone"
    public void inputPhoneDataWar1(String phoneNumber) {
        phoneInputWar1.click();
        phoneInputWar1.clear();
        phoneInputWar1.sendKeys(phoneNumber);
    }

//    Kliknięcie w przycisk "SAVE" i przejście do listy adresów
    public void saveNewAddressButtonWar1() {
        saveNewAddressButtonWar1.click();
    }

//    Kliknięcie w link "Addresses" i przejście do listy adresów bez zapisywania danych
    public void goToAddressesListLinkWar1() {
        goToAddressesListLinkWar1.get(2).click();
    }

//    Zwraca wartość pola "Alias"
    public String getAliasWar1() {
        return aliasInputWar1.getAttribute("value");
    }

//    Zwraca wartość pola "Address"
    public String getAddressWar1() {
        return addressInputWar1.getAttribute("value");
    }

//    Zwraca wartość pola "City"
    public String getCityWar1() {
        return cityInputWar1.getAttribute("value");
    }

//    Zwraca wartość pola "Zip Code"
    public String getZipCodeWar1() {
        return zipCodeInputWar1.getAttribute("value");
    }

//    Zwraca wartość pola "Phone"
    public String getPhoneCodeWar1() {
        return phoneInputWar1.getAttribute("value");
    }
}
