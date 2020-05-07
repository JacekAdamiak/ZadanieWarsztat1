package cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    @FindBy(xpath = "//*[@class='address-body']/address")
    List<WebElement> addressesListWar1;

    @FindBy(xpath = "//*[@data-link-action='edit-address']")
    List<WebElement> updateAddressesListWar1;

    @FindBy(xpath = "//*[@data-link-action='delete-address']")
    List<WebElement> deleteAddressesListWar1;


//    @FindBy(xpath = "//*[@class='address-footer']/a[1]")
//    List<WebElement> updateAddressesListWar1;

//    @FindBy(className = "address-body")
//    List<WebElement> addressesListWar1;

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

    public int getNumberOfAddresses() {
        return addressesListWar1.size();
    }

    public String getLastAddress () {
//        String output = "Taki błędny to jest adres";
//        return output;
        int lastAddress = addressesListWar1.size()-1;
        return addressesListWar1.get(lastAddress).getText();
    }

    public void updateLastAddress() {
        int lastAddress = addressesListWar1.size()-1;
        updateAddressesListWar1.get(lastAddress).click();
    }

    public void deleteLastAddress() {
        int lastAddress = addressesListWar1.size()-1;
        deleteAddressesListWar1.get(lastAddress).click();
    }


//   //*[@id="address-2726"]/div[2]/a[1]
//    //*[@id="address-2732"]/div[2]/a[1]





}
