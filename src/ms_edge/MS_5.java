package ms_edge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MS_5 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get( "https://www.wikipedia.org/" );
        driver.findElement( By.id( "js-link-box-fr" )).click();
    }
}
