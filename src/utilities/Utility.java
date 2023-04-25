package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends BaseTest {

    // the method will click on the element
    public void clikOnElement(By by) {
        WebElement element = driver.findElement(by);
        element.click();

    }


    //This method will get text
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();

    }


    // This method will send text to elements
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    // This method will send text to element
    public void sendKeysToElement(By by, CharSequence keys) {
        driver.findElement(by).sendKeys(keys);
    }

//    // This method will clear text from field
//    public void clearTextFromField(By by) {
//        driver.findElement(by).sendKeys(Keys.CONTROL + "a");
//        driver.findElement(by).sendKeys(Keys.DELETE);
    }

