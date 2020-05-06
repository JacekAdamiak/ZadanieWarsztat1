package cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddressesPageWar1 {
    private static WebDriver driver;

//    @FindBy(className = "material-icons")
//    WebElement createNewAddressJaca;

//    @FindBy(xpath = "//*[@id=\"content\"]/div[5]/a")
//    WebElement createNewAddressJaca;

    @FindBy(xpath = "//*[@data-link-action='add-address']")
    WebElement createNewAddressWar1;

    @FindBy(css = ".alert.alert-success")
    WebElement addressSuccessfullyAddedWar1;

    public MyAddressesPageWar1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addNewAddressWar1() {
        createNewAddressWar1.click();
    }

    public String getAddressSuccessfullyAddedInfoWar1() {
        return addressSuccessfullyAddedWar1.getText();
    }





}
