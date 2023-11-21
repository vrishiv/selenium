package firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FF_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get( "https://www.saucedemo.com/" );
    }
}
