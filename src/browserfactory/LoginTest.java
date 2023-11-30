package browserfactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void login(){
        driver.findElement( By.className("ico-login")).click();

        String actualText = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]")).getText();
        String ExpectedText = "Welcome, Please Sign In!";

        Assert.assertEquals(actualText,ExpectedText);
    }
    @Test
    public void userShouldLoginWithValidCredintial() {
        WebElement loginLink = driver.findElement( By.className( "ico-login" ) );
        loginLink.click();

        WebElement emailLoginField = driver.findElement( By.id( "Email" ) );
        emailLoginField.sendKeys( "codebuster12@gmail.com" );


        driver.findElement( By.id( "Password" ) ).sendKeys( "123456" );
        driver.findElement( By.xpath( "//button[contains(text(),'Log in')]" ) ).click();
        String actualErrorMsg = driver.findElement( By.xpath( "//div[@class='topic-block-title']" ) ).getText();
        String expectedErrorMsg = "Welcome to our store";
        Assert.assertEquals( actualErrorMsg, expectedErrorMsg );

    }
    @Test
            public void userSholdnotLoginWithInvalidCredential () {
        driver.findElement( By.className( "ico-login" ) ).click();
        driver.findElement( By.id( "Email" ) ).sendKeys( "codebuster@gmail.com" );
        driver.findElement( By.id( "Password" ) ).sendKeys( "123456" );
        driver.findElement( By.xpath( "//button[contains(text(),'Log in')]" ) ).click();
        String actualErrorMsg = driver.findElement( By.xpath( "//div[@class='message-error validation-summary-errors']" ) ).getText();
        String expectedErrorMsg = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals( actualErrorMsg, expectedErrorMsg );


    }

//    @After
//    public void endTest(){
//        closeBrowser();
//    }
}
