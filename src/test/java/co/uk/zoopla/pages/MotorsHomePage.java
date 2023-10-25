package co.uk.zoopla.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MotorsHomePage extends BasePage {

//#################################################################################
//            Constructor for the MotorsHomePage class
// ################################################################################
    //
    public MotorsHomePage(WebDriver driver) {
        this.driver = driver;
        // adding PageFactory
        PageFactory.initElements(driver, this);
    }
//  *******************************************************************************


//variable for AcceptButton on privacy pop-up
    @FindBy(css = "button#onetrust-accept-btn-handler")
    private WebElement acceptButton;
//#################################################################################
//            Method for Alert message on MotorsHomePage
// ################################################################################

    public void messagePrivacy(){
        acceptButton.click();
    }
//  *******************************************************************************

//variable for post code
    @FindBy(css="#searchPostcode")
    private WebElement postCode;
//##################################################################################
//            Method declaration for Enter Post code field on MotorsHomePage
//##################################################################################
    public void enterPostCode(String PostCode) {
        postCode.clear();
        postCode.sendKeys(PostCode);
     }
//  *******************************************************************************

// variable for Maker of car
    @FindBy(css="select#Make")
    private WebElement carMaker;

//#################################################################################
//            Method declaration for Car Maker
// ################################################################################
    public void selectCarMake(String make ){
        selectByText(carMaker, make);

    }
//  *******************************************************************************

//  variable for car Modle
    @FindBy(css ="select#Model")
    private WebElement carModel;//  variable for Modle of car
//  ###############################################################################
//            Method declation for Car Model
//  ###############################################################################
    public void selectCarModel(String model ){
        selectByText(carModel, model);

    }
//  *******************************************************************************

// variable for car Min Price
    @FindBy(css ="#MinPrice")
    private WebElement carMinPrice;
//  ###############################################################################
//            Method declation for Car Min Price
//  ###############################################################################
    public void selectCarMinPrice(String minPrice ){
        selectByText(carMinPrice, minPrice);

    }
//  *******************************************************************************

 // variable for car Max Price
    @FindBy(css ="#MaxPrice")
    private WebElement carMaxPrice;

//  ###############################################################################
//            Method declation for Car Max Price
//  ###############################################################################
    public void selectCarMaxPrice(String maxPrice ){
        selectByText(carMaxPrice, maxPrice);

    }
//  *******************************************************************************

//  variable for car Search Button
    @FindBy(css ="button[class='btn btn--expand sp__btn btn--spinner']")
    private WebElement searchButton;
//  ###############################################################################
    //Method declation for HandShak from MotorsHomePage to UsedCarSearchResultPage
//  ###############################################################################
    public UsedCarSearchResultPage clickOnSearchButton() throws InterruptedException {
//driver.switchTo().frame("/html/body/noscript[1]/text()");
//        JavascriptExecutor jse   = (JavascriptExecutor) driver;
//        jse.executeScript("arguments[0].click()", searchButton);

        searchButton.click();

                return new UsedCarSearchResultPage(driver);

    }
//  *******************************************************************************
}