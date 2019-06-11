package uitesting.upb.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.google.home.Home;

public class GoogleHomeStepdefs {
    private Home home;
    @Given("^Home page is loaded$")
    public void homePageIsLoaded() {
        home = LoadPage.loadAppHome();
    }
    @And("^browser maximized$")
    public void maximizeWindow(){
        LoadPage.maximizeWindow();
    }
    @Then("^account field is visible$")
    public boolean isAccountFieldVisible(){
        return home.isAccountFieldVisible();
    }
    @Then("^fill and create account$")
    public void createAccount() {
        home.createAccount("Cert-4");
    }
    @Then("^log account$")
    public void enterAccount(){
        home.clickAccountButton();
    }
    @Then("^category field is visible$")
    public boolean isCategoryFieldVisible(){
        return home.isCategoryFieldVisible();
    }
    @Then("^click incomes button$")
    public void clickIncomesButton(){
        home.clickIncomesButton();
    }
    @Then("^fill and create category$")
    public void createCategory(){
        home.createCategory("Category Example");
    }

}
