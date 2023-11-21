package google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Google_H4 {

    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get( "https://www.startpage.com/" );

        String about = driver.navigate().toString();
        driver.manage().window().minimize();
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds( 10 ) );
        driver.quit();




    }
}
