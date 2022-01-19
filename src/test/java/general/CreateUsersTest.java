package general;

import lib.MainMetods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class CreateUsersTest extends MainMetods {
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



        login(driver,"Admin@Admin.com","Admin@Admin.com");

        System.out.println("Check url");
        assertEquals("http://localhost:8080/groups", driver.getCurrentUrl());
        Thread.sleep(1000);

        System.out.println("Check title");
        assertEquals("IndivAMR Cloud", driver.getTitle());
        Thread.sleep(1000);

        System.out.println("Check menu");
        driver.findElement(By.xpath("//*[@aria-label='menu']")).click();
        Thread.sleep(1000);

        System.out.println("Click Настройки");
        driver.findElement(By.xpath("//span[contains(text(), 'Настройки')]")).click();
        Thread.sleep(1000);


        System.out.println("Click Управление пользователями");
        driver.findElement(By.xpath("//span[contains(text(), 'Управление пользователями')]")).click();
        Thread.sleep(1000);


        System.out.println("Click Добавить");
        driver.findElement(By.xpath("//*[@title='Добавить']")).click();
        Thread.sleep(2000);

        System.out.println("Click Email");
        driver.findElement(By.xpath("/html/body/div[7]/form/div/div[2]/div/div[1]/div/input")).sendKeys("Admin3@Admin.com");
        Thread.sleep(2000);

        System.out.println("Enter Роли");
        driver.findElement(By.xpath("/html/body/div[7]/form/div/div[2]/div/div[2]/div/div")).sendKeys("Менеджер");
        Thread.sleep(2000);

        System.out.println("Enter Пароль");
        driver.findElement(By.xpath("/html/body/div[7]/form/div/div[2]/div/div[3]/div/input")).sendKeys("Admin@Admin.com");
        Thread.sleep(2000);

        System.out.println("Enter Подтверждение пароля");
        driver.findElement(By.xpath("/html/body/div[7]/form/div/div[2]/div/div[4]/div/input")).sendKeys("Admin@Admin.com");
        Thread.sleep(2000);

        System.out.println("Click Сохранить");
        driver.findElement(By.xpath("//div[3]/div/button[2]/span[1]")).click();
        Thread.sleep(2000);

        System.out.println("Click Удалить");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[2]/div[1]/div[2]/div/div/div/table/tbody/tr[4]/td[3]/div/button[2]")).click();
        Thread.sleep(2000);

        System.out.println("Click Сохранить");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[2]/div[1]/div[2]/div/div/div/table/tbody/tr[4]/td[2]/div/button[1]/span[1]/span")).click();
        Thread.sleep(2000);

    }


        @After
        public void afterTest() {
            driver.quit();
        }
    }


