package google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NHS {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get( " https://www.nhs.uk/" );
//        driver.findElement( new By.ByXPath("//*[@id=\"header-navigation\"]/ul/li[4]/a]") ).click();
    }
}
