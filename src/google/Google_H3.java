package google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_H3 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get( "https://duckduckgo.com/" );
        String title = driver.getTitle();
        driver.manage().window().maximize();
        System.out.println(driver.getPageSource());
        driver.quit();

    }
}
