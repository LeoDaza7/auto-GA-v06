package uitesting.upb.org.managepage.google.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

/**
 * @autor Marcelo Garay
 */
public class Home extends BasePage {

    @FindBy(id = "nav-button")
    private WebElement nasaNavButton;

    @FindBy(xpath = "/html/body/div[1]")
    private WebElement nasaNavBar;

    @FindBy(xpath = "//*[@id=\"tocify-header1\"]/li")
    private WebElement nasaAPIListingButton;

    public void clickNasaAPIListingButton(){
        Events.click(nasaAPIListingButton);
    }

    public Home clickNasaNavButton() {
        Events.click(nasaNavButton);
        return this;

    }

    public void clickAndClick(){
        //clickNasaNavButton().clickNasaAPIListingButton();
    }

    /*@FindBy(id = "accountNameInput")
    private WebElement searchTextField;

    @FindBy(id = "addAccountButton")
    private WebElement searchButton;

    public Home searchText(String text){
        Events.fillField(searchTextField, text);
        return this;
    }

    public void clickSearchButton() {
        Events.click(searchButton);
    }

    public boolean isSearchFieldVisible(){
        return Events.isVisibleWebElement(searchTextField);
    }

    public void searchTextAndClickSearchButton(String text){
        searchText(text).clickSearchButton();
    }*/
}
