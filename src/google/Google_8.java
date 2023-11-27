package google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_8 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get( "https://demoqa.com/" );
        driver.manage().window().maximize();
//        driver.findElement( By.className( "card-up" )).click();
    }
}
