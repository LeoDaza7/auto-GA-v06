package uitesting.upb.org.managepage.google.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

/**
 * @autor Marcelo Garay
 */
public class Home extends BasePage {

    @FindBy(id = "accountNameInput")
    private WebElement accountTextField;

    @FindBy(id = "addAccountButton")
    private WebElement addAccountButton;

    @FindBy(id = "Cert-4")
    private WebElement accountButton;

    @FindBy(id="Income")
    private WebElement incomesButton;

    @FindBy(id="categoryRegister")
    private WebElement categoryTextField;

    @FindBy(id="buttonCategory")
    private WebElement categoryButton;

    public boolean isAccountFieldVisible(){
        return Events.isVisibleWebElement(accountTextField);
    }
    public Home fillAccountField(String text){
        Events.fillField(accountTextField, text);
        return this;
    }

    public void clickAddAccountButton() {
        Events.click(addAccountButton);
    }

    public void createAccount(String text){
        fillAccountField(text).clickAddAccountButton();
    }

    public void  clickAccountButton(){
        Events.click(accountButton);
    }

    public void clickIncomesButton(){
        Events.click(incomesButton);
    }

    public boolean isCategoryFieldVisible(){
        return Events.isVisibleWebElement(categoryTextField);
    }

    public Home fillCategoryField(String text){
        Events.fillField(categoryTextField,text);
        return this;
    }

    public void clickCategoryButton(){
        Events.click(categoryButton);
    }

    public void createCategory(String text){
        fillCategoryField(text).clickCategoryButton();
    }

}
