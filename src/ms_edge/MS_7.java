package ms_edge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MS_7 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get( "https://automationexercise.com/test_cases" );
        driver.navigate().to( "https://automationexercise.com/" );
//        driver.findElement( By.id( "products" ) ).click();

    }
}
