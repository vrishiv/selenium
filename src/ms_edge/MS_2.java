package ms_edge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MS_2 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get( "https://www.saucedemo.com/" );
        driver.findElement( By.id("user-name")).sendKeys("standard_user" );
        driver.findElement( By.name( "password" )).sendKeys("secret_sauce");
        driver.findElement( By.className( "submit-button" )).click();

    }
}
