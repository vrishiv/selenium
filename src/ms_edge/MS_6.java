package ms_edge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MS_6 {
    public static void main(String[] args) {
        WebDriver driver= new EdgeDriver();
        driver.get( "https://compendiumdev.co.uk/" );// open site
        driver.manage().window().minimize(); // minimize window
        driver.manage().window().maximize(); //maximize window
        driver.findElement( By.id( "cssmenu" )).click();// open blog

    }
}
