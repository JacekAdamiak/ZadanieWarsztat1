package cucumber.steps;

import cucumber.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewAddressWar1Steps {
    private WebDriver driver;

    @Given("an open browser with login page")
    public void openLoginPageWar1() {
        // Skonfiguruj sterownik przeglądarki
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();
        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do strony logowania
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication");
    }

    @When("user successfully logged in")
    public void successfulLogin() {
        LoginPageWar1 loginPageWar1 = new LoginPageWar1(driver);
        loginPageWar1.loginAsWar1("janek.bury@webowo.pl", "JanekBury");

        HeaderWar1 headerWar1 = new HeaderWar1(driver);
        Assert.assertEquals("Janek Bury", headerWar1.getLoggedWar1());
        System.out.println("Zalogowany jako: "+headerWar1.getLoggedWar1());
    }

    @And("user goes to view customer account")
    public void userGoesToViewCustomerAccount() {
        HeaderWar1 headerWar1 = new HeaderWar1(driver);
        headerWar1.goToUserInformationViewWar1();
    }

    @And("user goes to addresses page")
    public void userGoesToAddressesPage() {
        MyAccountPageWar1 myAccountPageWar1 = new MyAccountPageWar1(driver);
        myAccountPageWar1.goToAddressPageWar1();
    }

    @And("user click create new address link")
    public void userClickCreateNewAddressLink() {
        MyAddressesPageWar1 myAddressesPageWar1 = new MyAddressesPageWar1(driver);
        myAddressesPageWar1.addNewAddressWar1();
    }

    @And("user put a alias (.*) in alias input field")
    public void userPutAliasInNewAddress(String alias) {
        AddressPageWar1 addressPageWar1 = new AddressPageWar1(driver);
        addressPageWar1.inputAliasDataWar1(alias);
    }

    @And("user put a address (.*) in address input field")
    public void userPutAddressInNewAddress(String address) {
        AddressPageWar1 addressPageWar1 = new AddressPageWar1(driver);
        addressPageWar1.inputAddressDataWar1(address);
    }

    @And("user put a city (.*) in city input field")
    public void userPutCityInNewAddress(String city) {
        AddressPageWar1 addressPageWar1 = new AddressPageWar1(driver);
        addressPageWar1.inputCityDataWar1(city);
    }

    @And("user put a zipcode (.*) in zipcode input field")
    public void userPutZipCodeInNewAddress(String zipcode) {
        AddressPageWar1 addressPageWar1 = new AddressPageWar1(driver);
        addressPageWar1.inputZipDataWar1(zipcode);
    }

    @And("user put a phone (.*) in phone input field")
    public void userPutPhoneInNewAddress(String phone) {
        AddressPageWar1 addressPageWar1 = new AddressPageWar1(driver);
        addressPageWar1.inputPhoneDataWar1(phone);
    }

    @And("user save new address")
    public void userSaveNewAddress() {
        AddressPageWar1 addressPageWar1 = new AddressPageWar1(driver);
        addressPageWar1.saveNewAddressButtonWar1();
    }

    @Then("user sees information of new address successfully added")
    public void addressSuccessfullyAdded() {
        MyAddressesPageWar1 myAddressesPageWar1 = new MyAddressesPageWar1(driver);
        Assert.assertEquals("Address successfully added!",
                myAddressesPageWar1.getAddressSuccessfullyAddedInfoWar1());

        myAddressesPageWar1.updateLastAddress();

        AddressPageWar1 addressPageWar1 = new AddressPageWar1(driver);
        Assert.assertEquals("Biurowy Janka", addressPageWar1.getAliasWar1());
        Assert.assertEquals("Przemysłowa", addressPageWar1.getAddressWar1());
        Assert.assertEquals("Wodzisław", addressPageWar1.getCityWar1());
        Assert.assertEquals("00-223", addressPageWar1.getZipCodeWar1());
        Assert.assertEquals("551-223-123", addressPageWar1.getPhoneCodeWar1());

        addressPageWar1.goToAddressesListLinkWar1();
    }
    @And("user delete last address")
    public void deleteLastAddressFromAddressesList() {
        MyAddressesPageWar1 myAddressesPageWar1 = new MyAddressesPageWar1(driver);
        int numberOfAddressesBefore = myAddressesPageWar1.getNumberOfAddresses();
        myAddressesPageWar1.deleteLastAddress();
        int numberOfAddressesAfter = myAddressesPageWar1.getNumberOfAddresses();
        Assert.assertEquals(numberOfAddressesBefore, numberOfAddressesAfter+1);
        Assert.assertEquals("Address successfully deleted!",
                myAddressesPageWar1.getAddressSuccessfullyAddedInfoWar1());

    }

    @And("close browser")
    public void closeBrowser() {
//        driver.close();
    }
}
