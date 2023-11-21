package ms_edge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MS_4 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get( "https://petstore.octoperf.com/actions/Catalog.action" );
        driver.findElement( By.id( "Menu" )).click();
    }
}
