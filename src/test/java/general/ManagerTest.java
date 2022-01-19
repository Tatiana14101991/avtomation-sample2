package general;

import lib.MainMetods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;



public class ManagerTest extends MainMetods {
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

        
        login(driver,"Admin3@Admin.com","Admin@Admin.com");

        System.out.println("Check url");
        assertEquals("http://localhost:8080/groups", driver.getCurrentUrl());

        System.out.println("Check title");
        assertEquals("IndivAMR Cloud", driver.getTitle());
        Thread.sleep(3000);

        System.out.println("Check menu");
        driver.findElement(By.xpath("//*[@aria-label='menu']")).click();
        Thread.sleep(3000);


    }

    @After
    public void afterTest() {
        driver.quit();
    }
}

