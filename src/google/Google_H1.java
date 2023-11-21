package google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_H1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get( "https://reqres.in/" );
        String titlepage = driver.getTitle();
        System.out.println(titlepage);
        driver.manage().window().fullscreen();
        driver.manage().timeouts();
        System.out.println(driver.manage());
        driver.quit();
    }
}
