import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class createUsers {
    public ChromeDriver driver;


    @Before
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/settings");
        driver.manage().window().maximize();


    }


    @Test
    public void testLogin() throws InterruptedException {

        System.out.println("Check url");
        assertEquals("http://localhost:8080/login", driver.getCurrentUrl());

        System.out.println("Enter Email");
        driver.findElement(By.id("Email")).sendKeys("Admin@Admin.com");
        //Thread.sleep(5000);

        System.out.println("Enter password");
        driver.findElement(By.id("password")).sendKeys("Admin@Admin.com");
        //Thread.sleep(5000);

        System.out.println("Click Enter");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[1]/button/span[1]")).click();
        Thread.sleep(5000);

        System.out.println("Check url");
        assertEquals("http://localhost:8080/groups", driver.getCurrentUrl());

        System.out.println("Check title");
        assertEquals("IndivAMR Cloud", driver.getTitle());
        Thread.sleep(5000);

        System.out.println("Check menu");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/header[2]/div/button")).click();
        Thread.sleep(5000);

        System.out.println("Click settings");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/aside/div/div[2]/div/div/div/div[3]/div/a/div/span")).click();
        Thread.sleep(5000);


    }


    @Test
    public void createUsers() throws InterruptedException {




        System.out.println("Click Управление пользователями");//*[@id="root"]/div/section/div/aside/div/div[2]/div/div/div/div[3]/div/a/span
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[1]/div/div/button[2]/span[1]")).click();
        Thread.sleep(10000);

        System.out.println("Click Добавить");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[2]/div[1]/div[1]/div[4]/div/div/span/button[1]")).click();
        Thread.sleep(10000);

        System.out.println("Enter Email");
        driver.findElement(By.xpath("/html/body/div[5]/form/div/div[2]/div/div[1]/label/text()")).sendKeys("Admin5@Admin.com");

        System.out.println("Enter Роли");
        driver.findElement(By.xpath("/html/body/div[5]/form/div/div[2]/div/div[2]/label/text()")).sendKeys("Менеджер");

        System.out.println("Enter Палоль");
        driver.findElement(By.xpath("/html/body/div[5]/form/div/div[2]/div/div[3]/label/text()")).sendKeys("Admin@Admin.com");

        System.out.println("Enter Подтверждение пароля");
        driver.findElement(By.xpath("/html/body/div[5]/form/div/div[2]/div/div[4]/label/text()")).sendKeys("Admin@Admin.com");

        System.out.println(By.xpath("Click on Сохранить"));
        driver.findElement(By.xpath("/html/body/div[5]/form/div/div[3]/div/button[2]/span[1]")).click();

    }


        @After
        public void afterTest() {
            driver.quit();
        }
    }


