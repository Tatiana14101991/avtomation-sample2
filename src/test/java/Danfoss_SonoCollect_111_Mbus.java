import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class Danfoss_SonoCollect_111_Mbus {
    public ChromeDriver driver;

    @Before
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/login");
        driver.manage().window().maximize();
    }


    @Test
    public void Danfoss_SonoCollect_111_Mbus() throws InterruptedException {


        System.out.println("Enter Email");
        driver.findElement(By.id("Email")).sendKeys("Admin@Admin.com");
        Thread.sleep(1000);

        System.out.println("Enter password");
        driver.findElement(By.id("password")).sendKeys("Admin@Admin.com");
        Thread.sleep(1000);

        System.out.println("Click Enter");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[1]/button/span[1]")).click();

        Thread.sleep(2000);
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

        Thread.sleep(2000);
        System.out.println("Click Добавить");
        driver.findElement(By.xpath("//*[@title='Добавить']")).click();
        Thread.sleep(3000);

        System.out.println("Click Тип устройства");
        driver.findElement(By.xpath("//label[contains(text(),'Тип устройства')]/following::div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[contains(text(),'Danfoss SonoCollect-111')]")).click();


        System.out.println("Click Далее");
        driver.findElement(By.xpath("//span[contains(text(), 'Далее')]")).click();
        Thread.sleep(3000);

        System.out.println("Click Добавить");
        driver.findElement(By.xpath("//button[@title='Добавить']")).click();
        Thread.sleep(1000);


        WebElement tr = driver.findElement(By.xpath("//span[@title='Сохранить']/../../.."));
        System.out.println(tr.getTagName());

        System.out.println("Enter IPv4");
        tr.findElement(By.xpath("//tr[2]/td[2]/div/div/input")).sendKeys("test176");
        Thread.sleep(1000);

        System.out.println("Click Типы загрузки");
        tr.findElement(By.xpath("//tr[2]/td[3]/div/div/div")).click();
        driver.findElement(By.xpath("*//li[contains(text(),'MBus')]")).click();

        driver.findElement(By.xpath("//body")).click();
        Thread.sleep(3000);

        System.out.println("Enter Login");
        tr.findElement(By.xpath("//tr[2]/td[4]/div/div/input")).sendKeys("test176");
        Thread.sleep(1000);

        System.out.println("Enter Пароль");
        tr.findElement(By.xpath("//tr[2]/td[5]/div/div/input")).sendKeys("test176");//переписать нормально
        Thread.sleep(1000);

        System.out.println("Click Сохранить");
        WebElement save = tr.findElement(By.xpath("//button[@title='Сохранить']"));
        System.out.println(save.getTagName());
        save.click();
        Thread.sleep(3000);

        System.out.println("Check Сохранить все изменения");
        driver.findElement(By.xpath(".//span[contains(text(), 'Сохранить')]")).click();
        Thread.sleep(3000);

        System.out.println("Check Изменить");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//td[@value='test176']/..//span[text()='edit']")).click();

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

