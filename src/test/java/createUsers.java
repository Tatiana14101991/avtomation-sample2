//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import static org.junit.Assert.assertEquals;
//
//public class createUsers {
//    public ChromeDriver driver;
//
//
//    @Before
//    public void beforeTest() {
//        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("http://localhost:8080/settings");
//        driver.manage().window().maximize();
//    }
//
//
//    @Test
//    public void someTest() {
//
//
//        System.out.println("Check url");
//        assertEquals("http://localhost:8080/settings", driver.getCurrentUrl());
//
//        System.out.println("Check title");
//        assertEquals("IndivAMR Cloud", driver.getTitle());
//    }
//
//    @Test
//    public void createUsers() throws InterruptedException {
//
//
//        System.out.println("Click on Управление пользователями");
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[1]/div/div/button[2]/span[1]")).click();
//        Thread.sleep(10000);
//
//        System.out.println("Click on Добавить");
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[2]/div[1]/div[1]/div[4]/div/div/span/button[1]")).click();
//
//        System.out.println("Enter Email");
//        driver.findElement(By.xpath("/html/body/div[5]/form/div/div[2]/div/div[1]/label/text()")).sendKeys("Admin5@Admin.com");
//
//        System.out.println("Enter Роли");
//        driver.findElement(By.xpath("/html/body/div[5]/form/div/div[2]/div/div[2]/label/text()")).sendKeys("Менеджер");
//
//        System.out.println("Enter Палоль");
//        driver.findElement(By.xpath("/html/body/div[5]/form/div/div[2]/div/div[3]/label/text()")).sendKeys("Admin@Admin.com");
//
//        System.out.println("Enter Подтверждение пароля");
//        driver.findElement(By.xpath("/html/body/div[5]/form/div/div[2]/div/div[4]/label/text()")).sendKeys("Admin@Admin.com");
//
//        System.out.println(By.xpath("Click on Сохранить"));
//        driver.findElement(By.xpath("/html/body/div[5]/form/div/div[3]/div/button[2]/span[1]")).click();
//    }
//
//
//        @After
//        public void afterTest() {
//            driver.quit();
//        }
//    }
//

