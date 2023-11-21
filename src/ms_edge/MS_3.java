package ms_edge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MS_3 {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get( "https://automationbookstore.dev" );
//        driver.findElement( By.id( "pid1_thumb" )).click();

    }
}
