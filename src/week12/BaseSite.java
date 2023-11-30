package week12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSite {
    public static WebDriver driver;

    public void openBrowser( String baseUrl){
        driver = new ChromeDriver();
        driver.get(baseUrl);
//        String titleOfPage = driver.getTitle();
//        System.out.println(titleOfPage);
        driver.manage().window().maximize();
    }

    public void closeBrowser(){
        driver.quit();
    }
}
