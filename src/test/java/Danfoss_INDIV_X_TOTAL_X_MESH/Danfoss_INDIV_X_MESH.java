package Danfoss_INDIV_X_TOTAL_X_MESH;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class Danfoss_INDIV_X_MESH {
    public ChromeDriver driver;

    @Before
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/login");
        driver.manage().window().maximize();
    }


    @Test
    public void SonoCollect_110FtpPassive() throws InterruptedException {


        System.out.println("Enter Email");
        driver.findElement(By.id("Email")).sendKeys("Admin@Admin.com");
        Thread.sleep(1000);

        System.out.println("Enter password");
        driver.findElement(By.id("password")).sendKeys("Admin@Admin.com");
        Thread.sleep(1000);

        System.out.println("Click Enter");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[1]/button/span[1]")).click();
        Thread.sleep(1000);

        System.out.println("Check url");
        assertEquals("http://localhost:8080/groups", driver.getCurrentUrl());

        System.out.println("Check title");
        assertEquals("IndivAMR Cloud", driver.getTitle());
        Thread.sleep(1000);

        System.out.println("Check menu");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/header[2]/div/button")).click();
        Thread.sleep(1000);

        System.out.println("Click Настройки");
        driver.findElement(By.xpath(".//span[contains(text(), 'Настройки')]")).click();
        Thread.sleep(1000);

        System.out.println("Click Добавить");
        driver.findElement(By.xpath("//span[text()=\"add_box\"]")).click();
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
        driver.findElement(By.xpath("//tr[2]/td[1]/div/div/input")).sendKeys("01.12.2021");
        Thread.sleep(1000);

        System.out.println("Click Сохранить");
        WebElement save = driver.findElement(By.xpath("//button[@title='Сохранить']"));
        System.out.println(save.getTagName());
        save.click();
        Thread.sleep(3000);

        System.out.println("Check Сохранить все изменения");
        driver.findElement(By.xpath(".//span[contains(text(), 'Сохранить')]")).click();
        Thread.sleep(3000);


    }
    @After
        public void afterTest() {
            driver.quit();
        }
}
