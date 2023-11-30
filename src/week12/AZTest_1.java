package week12;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class AZTest_1 extends BaseSite {


    String baseUrl = "https://www.amazon.co.uk/";

    @Before
    public void setUp() {
        openBrowser( baseUrl );
    }

    @Test
    public void cookies() {
        driver.findElement( By.xpath( "//*[@id=\"sp-cc-customize\"]" ) ).click();
        driver.findElement( By.xpath( "//*[@id=\"a-autoid-1\"]/span/input" ) ).click();
    }

//    @Test
//    public void testOne() {
//        driver.findElement( By.xpath( "//*[@id=\"nav-hamburger-menu\"]")).click();
//    }

    @After
    public void endTest() {
        closeBrowser();
    }
}


