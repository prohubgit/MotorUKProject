package co.uk.zoopla.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UsedCarSearchResultPage extends BasePage{


//#################################################################################
//            Constructor for the UsedCarSearchResultPage class
// ################################################################################
    public UsedCarSearchResultPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
//  *******************************************************************************

//  variable declaration for results
    @FindBy(css =".result-card__link")
    private List<WebElement> result;

//  ###############################################################################
    //Method declation for Search Results on  UsedCarSearchResultPage
//  ###############################################################################
    public void isResultDisplayed(){
        Assert.assertTrue(result.size()>0);
    }
//  *******************************************************************************





}
