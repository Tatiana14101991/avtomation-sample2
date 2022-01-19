package general;

import lib.MainMetods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class CreateFlatTest extends MainMetods {
    public ChromeDriver driver;

    @Before
    public void beforeTest() {
    System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("http://localhost:8080/login");
    driver.manage().window().maximize();
    }


    @Test
    public void Создание_квартиры() throws InterruptedException {

        login(driver,"Admin@Admin.com","Admin@Admin.com");

        Thread.sleep(2000);
        System.out.println("Check url");
        assertEquals("http://localhost:8080/groups", driver.getCurrentUrl());

        System.out.println("Check title");
        assertEquals("IndivAMR Cloud", driver.getTitle());
        Thread.sleep(1000);

        System.out.println("Click Добавить");
        driver.findElement(By.xpath("//button[@title='Добавить']")).click();
        Thread.sleep(1000);

        System.out.println("Click Улица");
        driver.findElement(By.xpath("//input[@placeholder='Улица']")).sendKeys("Минская, 6");
        Thread.sleep(1000);

        System.out.println("Click Сохранить");
        driver.findElement(By.xpath("//button[1][@title='Сохранить']")).click();
        Thread.sleep(1000);

        System.out.println("Click Сохранить");
        driver.findElement(By.xpath("//button[3][@title='Сохранить']")).click();
        Thread.sleep(1000);

        System.out.println("Click Сохранить");
        driver.findElement(By.xpath("//button[3]//*[@class='MuiButton-label']")).click();
        Thread.sleep(1000);

        System.out.println("Click Удалить");
        driver.findElement(By.xpath("//button[1][@title='Удалить']")).click();
        Thread.sleep(2000);

        System.out.println("Click Сохранить");
        driver.findElement(By.xpath("//button[3][@title='Сохранить']")).click();
        Thread.sleep(1000);

        System.out.println("Click Сохранить");
        driver.findElement(By.xpath("//button[3]//*[@class='MuiButton-label']")).click();
        Thread.sleep(1000);

    }

        @After
        public void afterTest() {
            driver.quit();

        }
}
