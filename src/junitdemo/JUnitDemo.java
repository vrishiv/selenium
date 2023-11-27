package junitdemo;

import org.junit.*;

public class JUnitDemo {
    @BeforeClass
    public static void connection(){
        System.out.println("connection");
    }

    @Before
    public void openBrowser(){
        System.out.println("open browser");
    }

    @Test
    public void verifyLogin(){
        System.out.println("Test 1");
    }

    @Test
    public void VerifyLoginWithWrongCredentials(){
        System.out.println("Test 2");
    }

    @After
    public void closeBrowser(){
        System.out.println("close browser");
    }

    @AfterClass
    public static void disconnection(){
        System.out.println("dissconnection");
    }
}
