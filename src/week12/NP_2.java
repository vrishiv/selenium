package week12;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class NP_2 extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){openBrowser( baseUrl );

    }




    @Test
    public void test(){
        driver.findElement( By.className( "ico-register" ) ).click();
        driver.findElement(By.xpath( "//*[@id=\"gender-male\"]" )).click();
        driver.findElement( By.id( "FirstName" ));
        driver.findElement( By.id( "LastName" ));
        driver.findElement( By.xpath( "/html/body/div[6]/div[3]/div/div/div/" +
                "div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).click();
        driver.findElement( By.xpath( "/html/body/div[6]/div[3]" +
                "/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]/option[11]" ) ).click();

    }
//    @Test
//    public void test1(){
//
//    }



//   @After
//   public void endTest(){
//        closeBrowser();

   }

