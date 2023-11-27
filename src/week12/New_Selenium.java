package week12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class New_Selenium {
    static WebDriver driver;
    public static void main(String[] args) {


        driver= new ChromeDriver();
        driver.get( "https://demo.nopcommerce.com/" );
        String titleOfPage = driver.getTitle();
        System.out.println( titleOfPage );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( Duration.ofMillis( 500 ) );
        System.out.println( driver.getPageSource() );
        driver.quit();


        driver = new EdgeDriver();
        driver.get( "https://demo.nopcommerce.com/" );
        driver.quit();

        driver = new FirefoxDriver();
        driver.get( "https://demo.nopcommerce.com/" );
        driver.quit();

    }
}