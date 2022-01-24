package Pulsar_MBus;

import lib.MainMetods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class Pulsar_MBus_Converter_HttpEcl4Test extends MainMetods {

    public ChromeDriver driver;

    @Before
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/login");
        driver.manage().window().maximize();
    }


    @Test
    public void Pulsar_MBus_Converter_HttpEcl4Test() throws InterruptedException {

        login(driver,"Admin@Admin.com","Admin@Admin.com");

        Thread.sleep(2000);
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

        Thread.sleep(2000);
        System.out.println("Click Добавить");
        driver.findElement(By.xpath("//*[@title='Добавить']")).click();
        Thread.sleep(1000);

        System.out.println("Click Тип устройства");
        driver.findElement(By.xpath("//label[contains(text(),'Тип устройства')]/following::div")).click();
        driver.findElement(By.xpath("//li[contains(text(),'Pulsar MBus Converter')]")).click();


        System.out.println("Click Далее");
        driver.findElement(By.xpath("//*//span[contains(text(), 'Далее')]")).click();
        Thread.sleep(3000);

        System.out.println("Click Добавить");
        driver.findElement(By.xpath("//button[@title='Добавить']")).click();
        Thread.sleep(1000);


        WebElement tr = driver.findElement(By.xpath("//span[@title='Сохранить']/../../.."));//переписать нормально
        System.out.println(tr.getTagName());

        System.out.println("Click Типы загрузки");
        tr.findElement(By.xpath("td[2]/div/div")).click();
        driver.findElement(By.xpath("*//li[contains(text(),'HttpEcl4')]")).click();

        driver.findElement(By.xpath("//body")).click();
        Thread.sleep(3000);

        System.out.println("Enter IPv4");
        tr.findElement(By.xpath("td[3]/div/div/input")).sendKeys("test314");//переписать нормально
        Thread.sleep(1000);


        System.out.println("Click Сохранить");
        WebElement save = tr.findElement(By.xpath("//button[@title='Сохранить']"));
        System.out.println(save.getTagName());
        save.click();
        Thread.sleep(3000);

        System.out.println("Check Сохранить все изменения");
        driver.findElement(By.xpath(".//span[contains(text(), 'Сохранить')]")).click();
        Thread.sleep(3000);

        deleteElement(driver);
    }

    @After
    public void afterTest() {
        driver.quit();
    }
}

