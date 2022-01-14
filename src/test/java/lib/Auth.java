package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public  class Auth {

    public static void login(RemoteWebDriver driver, String login, String pass) throws InterruptedException {

        System.out.println("Enter Email");
        driver.findElement(By.id("Email")).sendKeys(login);
        Thread.sleep(1000);

        System.out.println("Enter password");
        driver.findElement(By.id("password")).sendKeys(pass);
        Thread.sleep(1000);

        System.out.println("Click Enter");
        driver.findElement(By.xpath("//*[text()='Enter']")).click();
        Thread.sleep(1000);
    }
}
