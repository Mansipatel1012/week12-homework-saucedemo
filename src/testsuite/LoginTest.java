package testsuite;

import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class LoginTest extends Utility {

    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        //Enter  username
        sendTextToElement(By.id("user-name"), "standard_user");
        //Enter  password
        sendTextToElement(By.id("password"), "secret_sauce");
        //Click on ‘LOGIN’ button
        clikOnElement(By.id("login-button"));
        // Verify the text “PRODUCTS”
        String expectedMessage ="Products";
        String actualMessage = getTextFromElement(By.xpath("//span[contains(text(),'Products')]"));
        //checking actual and expected result
        Assert.assertEquals(expectedMessage,actualMessage);

    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() throws InterruptedException {
        Thread.sleep(2000);
        //Enter  username
        sendTextToElement(By.id("user-name"), "standard_user");
        //Enter  password
        sendTextToElement(By.id("password"), "secret_sauce");
        //Click on ‘LOGIN’ button
        clikOnElement(By.id("login-button"));
        //Verify that six products are displayed on page
        List<WebElement> number = driver.findElements(By.xpath("//div[@class='inventory_item']"));
        int actualNumber = number.size();
        int expectedNumber = 6;
        Assert.assertEquals("6 product not displayed", expectedNumber, actualNumber);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
