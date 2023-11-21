package google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_H6 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get( "https://parabank.parasoft.com/parabank/admin.htm" );
        String ContactUs = String.valueOf( new ChromeDriver() );
        driver.get( "https://parabank.parasoft.com/parabank/contact.htm;jsessionid=EDC52A06691166E182ADB52B20212DDE" );
        driver.quit();


//        System.out.println(ContactUs);



    }

}
