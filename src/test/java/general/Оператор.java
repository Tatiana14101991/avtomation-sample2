package general;

import lib.Auth;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;



public class Оператор {
    public ChromeDriver driver;


    @Before
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/login");
        driver.manage().window().maximize();
    }





    @Test
    public void testLogin() throws InterruptedException {


        Auth.login(driver,"Admin@Admin.com","Admin4@Admin.com");
        System.out.println("Check url");
        assertEquals("http://localhost:8080/groups", driver.getCurrentUrl());

        System.out.println("Check title");
        assertEquals("IndivAMR Cloud", driver.getTitle());
        Thread.sleep(3000);

        System.out.println("Check menu");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/header[2]/div/button")).click();
        Thread.sleep(3000);


    }

    @After
    public void afterTest() {
        driver.quit();
    }

    public static class Login {
        public ChromeDriver driver;


        @Before
        public void beforeTest() {
            System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("http://localhost:8080/login");
            driver.manage().window().maximize();
        }


        @Test
        public void someTest() {


            System.out.println("someTest >> Check url");
            assertEquals("http://localhost:8080/login", driver.getCurrentUrl());

            System.out.println("someTest >> Check title");
            assertEquals("IndivAMR Cloud", driver.getTitle());
        }

        @Test
        public void testLogin() throws InterruptedException {
            Auth.login(driver,"Admin@Admin.com","Admin@Admin.com");



        }



        @After
        public void afterTest() {
            System.out.println("afterTest");
            driver.quit();

        }


    }
}

