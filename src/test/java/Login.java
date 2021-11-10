import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class Login {
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


        System.out.println("Check url");
        assertEquals("http://localhost:8080/login", driver.getCurrentUrl());

        System.out.println("Check title");
        assertEquals("IndivAMR Cloud", driver.getTitle());
    }

    @Test
    public void testLogin() throws InterruptedException {


        System.out.println("Enter Email");
        driver.findElement(By.id("Email")).sendKeys("Admin@Admin.com");
        Thread.sleep(5000);

        System.out.println("Enter password");
        driver.findElement(By.id("password")).sendKeys("Admin@Admin.com");
        Thread.sleep(5000);

        System.out.println("Click Enter");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[1]/button/span[1]")).click();
        Thread.sleep(5000);

    }


    @Test
    public void testLogout() throws InterruptedException {

        System.out.println("Check url");
        assertEquals("http://localhost:8080/groups", driver.getCurrentUrl());

        System.out.println("Check title");
        assertEquals("Обзор", driver.getTitle());


        System.out.println("Click Admin@Admin.com");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/header[1]/div/div[3]/button/span[1]/text()"));
        Thread.sleep(5000);

        System.out.println("Click Выйти");
        driver.findElement(By.xpath("//*[@id=\"user-menu\"]/div[3]/ul/li[2]/text()"));
        Thread.sleep(5000);
    }


    @After
    public void afterTest() {
        driver.quit();

    }


}

