package co.uk.zoopla.stepDefinitions;

import co.uk.zoopla.pages.BasePage;
import co.uk.zoopla.pages.MotorsHomePage;
import co.uk.zoopla.pages.UsedCarSearchResultPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class UsedCarsForSaleSearchSteps extends BasePage {

// instantiating MotorsHomePage.class
    MotorsHomePage motorsHomePage = PageFactory.initElements(driver, MotorsHomePage.class);

// instantiating UsedCardSearchResultHomePage.class
UsedCarSearchResultPage usedCarSearchResultPage = PageFactory.initElements(driver, UsedCarSearchResultPage.class);


    @Given("I navigate to motors homepage")
    public void i_navigate_to_motors_homepage() {
       launchUrl();
    }
    @When("I click on accept all button")
    public void iclickonacceptallbutton() {
        motorsHomePage.messagePrivacy();
    }
    @When("I enter {string} in post code text field")
    public void ienterinpostcodetextfield(String PostCode) {
        motorsHomePage.enterPostCode(PostCode);

    }

    @When("I select {string} from the Make dropdown")
    public void iselectfromtheMakedropdown(String Make) {
        motorsHomePage.selectCarMake(Make);
    }

    @When("I select {string} from the Model dropdown")
    public void iselectfromtheModeldropdown(String Model) {
        motorsHomePage.selectCarModel(Model);
    }

    @When("I select {string} from the Min Price dropdown")
    public void iselectfromtheMinPricedropdown(String MinPrice) {
        motorsHomePage.selectCarMinPrice(MinPrice);
    }

    @When("I select {string} from the Max Price dropdown")
    public void iselectfromtheMaxPricedropdown(String MaxPrice) {
        motorsHomePage.selectCarMaxPrice(MaxPrice);
    }

    @When("I click on Search button")
    public void iclickonSearchbutton() throws InterruptedException {

        usedCarSearchResultPage = motorsHomePage.clickOnSearchButton();
        //Thread.sleep(50000);
    }

    @Then("A list of cars within that {string} post code is displayed")
    public void alistofcarswithinthatpostcodeisdisplayed(String text) {
        System.out.println("Search Button method is executed sucessfully .....  "+ "iclickonSearchbutton()");
        //usedCarSearchResultPage.isResultDisplayed();
    }


}
