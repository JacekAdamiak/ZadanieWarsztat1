package cucumber.steps;

import cucumber.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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
//        return driver;
        // Przejdź do Google
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication");
//        driver.get("http://www.google.com");
    }

    @When("user successfully logged in")
//    @When("a keyword (.*) is entered in input field")
    public void successfulLogin() {
        LoginPageWar1 loginPageWar1 = new LoginPageWar1(driver);
        loginPageWar1.loginAsWar1("janek.bury@webowo.pl", "JanekBury");

    }

    @Then("user goes to view customer account")
//    @Then("the first one should contain (.*)")
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







    @And("close browser")
    public void closeBrowser() {
//        driver.close();
    }
}
