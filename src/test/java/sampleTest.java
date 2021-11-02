import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleTest {
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

        System.out.println("Check url");
        driver.findElement(By.xpath("http://localhost:8080/groups")).click();

        System.out.println();
        driver.findElement(By.xpath("//*[@id=\"Email-label\"]/text()")).sendKeys("Admin@Admin.com");

        System.out.println("Click on Пароль");
        driver.findElement(By.xpath("//*[@id=\"password-label\"]/text()")).sendKeys("Admin@Admin.com");

        System.out.println("Click Enter");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[1]/button/span[1]")).click();

    }


    @After
    public void afterTest() {
        driver.quit();

    }


}


