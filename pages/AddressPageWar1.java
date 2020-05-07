package cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class AddressPageWar1 {
    private static WebDriver driver;

    @FindBy(name = "alias")
    WebElement aliasInputWar1;

    @FindBy(name = "address1")
    WebElement addressInputWar1;

    @FindBy(name = "city")
    WebElement cityInputWar1;

    @FindBy(name = "postcode")
    WebElement zipCodeInputWar1;

    @FindBy(name = "phone")
    WebElement phoneInputWar1;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/footer/button")
    WebElement saveNewAddressButtonWar1;

    @FindBy(xpath = "//*[@itemprop='name']")
    List<WebElement> goToAddressesListLinkWar1;

//    List<WebElement> deleteAddressesListWar1;
//        @FindBy(xpath = "//*[@data-link-action='edit-address']")

    public AddressPageWar1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void inputAliasDataWar1(String alias) {
        aliasInputWar1.click();
        aliasInputWar1.clear();
        aliasInputWar1.sendKeys(alias);
    }

    public void inputAddressDataWar1(String address) {
        addressInputWar1.click();
        addressInputWar1.clear();
        addressInputWar1.sendKeys(address);
    }

    public void inputCityDataWar1(String city) {
        cityInputWar1.click();
        cityInputWar1.clear();
        cityInputWar1.sendKeys(city);
    }

    public void inputZipDataWar1(String zipCode) {
        zipCodeInputWar1.click();
        zipCodeInputWar1.clear();
        zipCodeInputWar1.sendKeys(zipCode);
    }

    public void inputPhoneDataWar1(String phoneNumber) {
        phoneInputWar1.click();
        phoneInputWar1.clear();
        phoneInputWar1.sendKeys(phoneNumber);
    }

    public void saveNewAddressButtonWar1() {
        saveNewAddressButtonWar1.click();
    }

    public void goToAddressesListLinkWar1() {
        goToAddressesListLinkWar1.get(2).click();
    }

    public String getAliasWar1() {
        return aliasInputWar1.getAttribute("value");
    }

    public String getAddressWar1() {
        return addressInputWar1.getAttribute("value");
    }

    public String getCityWar1() {
        return cityInputWar1.getAttribute("value");
    }

    public String getZipCodeWar1() {
        return zipCodeInputWar1.getAttribute("value");
    }

    public String getPhoneCodeWar1() {
        return phoneInputWar1.getAttribute("value");
    }

}
