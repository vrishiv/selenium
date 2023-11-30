package selectclass;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown  extends BaseTest {

    @Before
    public void setUp()
    {

    }



    @Test
    public void dropDownTest()
    {
        WebElement dropDown =driver.findElement( By.name("country"));
        Select select = new Select(dropDown);
        //select.selectByIndex(2); // select by index
        //select.selectByVisibleText("Australia");
        //select.selectByValue("Bangladesh");

        List<WebElement> allOption =select.getOptions();
        int sizeofDropDown=allOption.size();
        System.out.println(sizeofDropDown);

        for(WebElement element:allOption){
            if(element.getText().equalsIgnoreCase("Georgia")){
                System.out.println(element.getText());
            }
        }

    }
    @After
    public void endTest ()
    {

    }
}
