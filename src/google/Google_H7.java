package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_H7 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement( By.className( "product-rating-box" )).click();
        driver.navigate().to( "https://demo.nopcommerce.com/build-your-own-computer" );
//        driver.findElement( By.className( "ico-register" )).click();

    }

}
