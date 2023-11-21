package ms_edge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MS_1 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get( "https://restful-booker.herokuapp.com/" );
    }
}
