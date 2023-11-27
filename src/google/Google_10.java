package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Google_10 {
    public static void main(String[] args) throws interruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments( "--disable-cookies" );
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.roblox.com/" );

        driver.findElement( By.xpath( "//*[@id=\"cookie-banner-wrapper\"]/div[1]/div[2]/div/div/button[1]" ) ).click();
    }
}
