package cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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







//    public void inputAddressDataWar1(String address, String city, String zipCode) {
//        addressInputWar1.click();
//        addressInputWar1.clear();
//        addressInputWar1.sendKeys(address);
//
//        cityInputWar1.click();
//        cityInputWar1.clear();
//        cityInputWar1.sendKeys(city);
//
//        zipCodeInputWar1.click();
//        zipCodeInputWar1.clear();
//        zipCodeInputWar1.sendKeys(zipCode);
//
//        saveNewAddressButtonWar1.click();
//
//
//    }


}
