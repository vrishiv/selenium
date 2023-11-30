package week12;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoveHoliay extends BaseSite {
    String baseUrl = "https://www.loveholidays.com/";

    @Before
    public void setUp(){openBrowser(baseUrl);
    }




    @Test
    public void test(){

    }



    @After
    public void endTest(){ closeBrowser();

    }
}


