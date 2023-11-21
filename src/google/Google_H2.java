package google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_H2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.booking.com/" );
        String page = driver.getPageSource();
        System.out.println("page");
        driver.quit();


    }
}
