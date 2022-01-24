package Danfoss_INDIV_X_TOTAL_X_MESH;

import lib.MainMetods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class Danfoss_INDIV_X_MESH extends MainMetods {
    public ChromeDriver driver;

    @Before
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/login");
        driver.manage().window().maximize();
    }


    @Test
    public void Danfoss_INDIV_X_MESH() throws InterruptedException {


        login(driver,"Admin@Admin.com","Admin@Admin.com");

        System.out.println("Check url");
        assertEquals("http://localhost:8080/groups", driver.getCurrentUrl());

        System.out.println("Check title");
        assertEquals("IndivAMR Cloud", driver.getTitle());
        Thread.sleep(1000);

        System.out.println("Check menu");
        driver.findElement(By.xpath("//*[@aria-label='menu']")).click();
        Thread.sleep(1000);

        System.out.println("Click Настройки");
        driver.findElement(By.xpath(".//span[contains(text(), 'Настройки')]")).click();
        Thread.sleep(1000);

        System.out.println("Click Добавить");
        driver.findElement(By.xpath("//*[@title='Добавить']")).click();
        Thread.sleep(3000);

        System.out.println("Click Тип устройства");
        driver.findElement(By.xpath("//label[contains(text(),'Тип устройства')]/following::div")).click();//переписать нормально
        driver.findElement(By.xpath("//li[contains(text(),'Danfoss INDIV-X-MESH')]")).click();
        Thread.sleep(1000);

        System.out.println("Click Далее");
        driver.findElement(By.xpath(".//span[contains(text(), 'Далее')]")).click();
        Thread.sleep(3000);

        System.out.println("Click Добавить");
        driver.findElement(By.xpath("//button[@title='Добавить']")).click();
        Thread.sleep(1000);

        System.out.println("Click Дата установки");
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement ele = driver.findElement(By.xpath("(//*[@aria-label='Дата установки: press space to edit']"));
        wait.until(ExpectedConditions.elementToBeClickable(ele));
        ele.click();

        System.out.println("Click Сохранить");
        WebElement save = driver.findElement(By.xpath("//button[@title='Сохранить']"));
        System.out.println(save.getTagName());
        save.click();
        Thread.sleep(3000);

        System.out.println("Check Сохранить все изменения");
        driver.findElement(By.xpath(".//span[contains(text(), 'Сохранить')]")).click();
        Thread.sleep(3000);
        System.out.println("Check Изменить");
        driver.findElement(By.xpath("//td[@value='test65']/..//span[text()='edit']")).click();
        Thread.sleep(1000);

        System.out.println("Check Удалить");
        driver.findElement(By.xpath("//button[@title=\"Удалить\"]")).click();
        Thread.sleep(1000);

        System.out.println("Check Сохранить все изменения");
        driver.findElement(By.xpath("//*[text()='check']")).click();
        Thread.sleep(1000);

        System.out.println("Check Сохранить");
        driver.findElement(By.xpath("//*[text()='Сохранить']")).click();
        Thread.sleep(1000);

    }
    @After
        public void afterTest() {
            driver.quit();
        }
}
