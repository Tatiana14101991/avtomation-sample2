import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleTest2 {
    public ChromeDriver driver;

    @Before
    public void  beforeTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/U405487/repo/Project1/drv/chromedriver.exe");
        driver = new ChromeDriver();

    }



    @Test
    public void testSample() {
        driver.get("http://localhost:8080/groups");
        driver.manage().window().maximize();

        System.out.println("Enter Enter");
        driver.findElement(By.xpath("//*[@id=\"password-label\"]/text()")).click();


        System.out.println("Click on Управление пользователями");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[1]/div/div/button[2]/span[1]")).click();

        System.out.println("Click on Добавить");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[2]/div[1]/div[1]/div[4]/div/div/span/button[1]")).click();

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


