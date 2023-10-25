package co.uk.zoopla.pages;

import co.uk.zoopla.common.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends Driver {
    public String BASE_URL = "https://www.motors.co.uk/";
    // Declaring Select variable;
    public Select select;

//#################################################################################
//            Method for launching browser
// ################################################################################
    public void launchUrl(){
        driver.navigate().to(BASE_URL);

    }
//  *******************************************************************************

//#################################################################################
//            Method for lSelecting By text from ListBox
// ################################################################################
    public void selectByText(WebElement element, String text){
        select = new Select(element);
        select.selectByVisibleText(text);

    }
//  *******************************************************************************

//#################################################################################
//            Method for lSelecting By Value from ListBox
// ################################################################################
    public void selectByValue(WebElement element, String value){
        select = new Select(element);
        select.selectByValue(value);

    }
//  *******************************************************************************

    //#################################################################################
//            Method for lSelecting by Index from ListBox
// ################################################################################
    //Define method to select by index
    public void selectByIndex(WebElement element, int index){
        select = new Select(element);
        select.selectByIndex(index);

    }
//  *******************************************************************************
//#################################################################################
//            Method for Scroll Web Page Vertical
// ################################################################################
// use negative vale to traverse upward
public void scrollPageVerticall(){
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("window.scrollBy(0,2000)");

}
//  *******************************************************************************
//#################################################################################
//            Method for Scroll within WebElement/dropdown Vertical
// ################################################################################
// use negative vale to traverse upward
public void scrollWebElementVerticall(){
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("window.scrollBy(0,2000)");

}
//  *******************************************************************************
}
