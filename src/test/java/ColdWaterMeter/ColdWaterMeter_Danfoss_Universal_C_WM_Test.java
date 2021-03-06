package ColdWaterMeter;

import lib.MainMetods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

public class ColdWaterMeter_Danfoss_Universal_C_WM_Test extends MainMetods {
    public ChromeDriver driver;

    @Before
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/login");
        driver.manage().window().maximize();
    }


    @Test
    public void ColdWaterMeter_Danfoss_Universal_C_WM_Test() throws InterruptedException {


        login(driver,"Admin@Admin.com","Admin@Admin.com");

        System.out.println("Check url");
        assertEquals("http://localhost:8080/groups", driver.getCurrentUrl());

        System.out.println("Check title");
        assertEquals("IndivAMR Cloud", driver.getTitle());
        Thread.sleep(1000);

        System.out.println("Click Бориса Пастернака,25");
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.xpath("//*[contains(text(), 'Бориса Пастернака,25')]"));
        actions.doubleClick(elementLocator).perform();
        Thread.sleep(1000);

        System.out.println("35");
        elementLocator = driver.findElement(By.xpath("//*[@value='35']"));
        actions.doubleClick(elementLocator).perform();
        Thread.sleep(2000);

        System.out.println("Click Добавить");
        driver.findElement(By.xpath("//*[@title='Добавить']")).click();
        Thread.sleep(2000);

        System.out.println("Click Тип устройства");
        driver.findElement(By.xpath("//label[contains(text(),'Тип устройства')]/following::div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[contains(text(),'Счетчик холодной воды')]")).click();
        Thread.sleep(1000);

        System.out.println("Click Модель");
        driver.findElement(By.xpath("//label[contains(text(),'Модель')]/following::div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[contains(text(),'Universal C-WM')]")).click();
        Thread.sleep(1000);

        System.out.println("Click Далее");
        driver.findElement(By.xpath(".//span[contains(text(), 'Далее')]")).click();
        Thread.sleep(3000);

        System.out.println("Click Добавить");
        driver.findElement(By.xpath("//*[@title='Добавить']")).click();
        Thread.sleep(1000);

        System.out.println("Enter Серийный номер");
        driver.findElement(By.xpath("//tr[2]/td[1]/div/div/input")).sendKeys("21513");
        Thread.sleep(1000);

        System.out.println("Click Адаптер");
        driver.findElement(By.xpath("/html/body/div[11]/form/div/div[2]/div[2]/div[3]/div/div/div/table/tbody/tr[2]/td[10]/div/div/svg")).click();
        driver.findElement(By.xpath("//div[contains(text(),'888')]")).click();

        System.out.println("Click Сохранить");
        driver.findElement(By.xpath("//button[1][@title='Сохранить']")).click();
        Thread.sleep(2000);

        System.out.println("Click Сохранить");
        driver.findElement(By.xpath("//div[3]/div/button[2]/span[1]")).click();
        Thread.sleep(2000);

        deleteElement(driver);

    }


        @After
    public void afterTest() {
        driver.quit();
    }
}

