package week12;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class AutomationExe extends BaseSite {
    String baseUrl = "https://automationexercise.com/";

    @Before
    public void setUp(){ openBrowser( baseUrl );

    }

    @Test
    public void LoginWithValidID(){
        driver.findElement( By.xpath( "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a" )).click();
        driver.findElement(By.xpath( "//*[@id=\"form\"]/div/div/" +
                "div[1]/div[1]/form/input[2]" )).sendKeys( "hitesh1234@gmail.com" );
        driver.findElement( By.xpath( "//*[@id=\"form\"]/div/" +
                "div/div[1]/div[1]/form/input[3]" ) ).sendKeys( "987654" );
        driver.findElement( By.xpath( "//*[@id=\"form\"]/div/div/div[1]/div[1]/form/button" ) ).click();

    }
    @Test
    public void LoginWithInvalidPW(){
        driver.findElement( By.xpath( "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a" )).click();
        driver.findElement(By.xpath( "//*[@id=\"form\"]/" +
                "div/div/div[1]/div[1]/form/input[2]" )).sendKeys( "hitesh1234@gmail.com" );
        driver.findElement( By.xpath( "//*[@id=\"form\"]/div/div/div" +
                "[1]/div[1]/form/input[3]" ) ).sendKeys( "123456" );
        driver.findElement( By.xpath( "//*[@id=\"form\"]" +
                "/div/div/div[1]/div[1]/form/button" ) ).click();

    }
    @Test
    public void deletID(){
        driver.findElement( By.xpath( "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a" ) ).click();
    }




//    @After
//    public void endTest(){closeBrowser();

    }


