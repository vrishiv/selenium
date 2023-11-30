package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NHS {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get( " https://www.nhs.uk/" );
        driver.findElement( new By.ByXPath("//*[@id=\"nhsuk-cookie-banner__link_accept\"]") ).click();
        driver.findElement(By.xpath( "//*[@id=\"content-header\"]/div[1]/a")).click();
//        driver.findElement( By.xpath( "//*[@id=\"header-navigation\"]/ul/li[4]/a" ) ).click();
    }
}
