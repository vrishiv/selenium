package browserfactory;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class OrangeHRM_1 extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){ openBrowser( baseUrl );

    }





    @Test
    public void test(){
        driver.findElement( By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input" )).sendKeys( "Admin" );
        driver.findElement( By.xpath( "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input" ) ).sendKeys( "admin123" );
        driver.findElement( By.xpath( "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button" ) ).click();

    }



//    @After
//    public void endTest(){
//
//    }
}
