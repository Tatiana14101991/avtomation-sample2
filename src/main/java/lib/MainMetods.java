package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MainMetods {

    protected void deleteElement(RemoteWebDriver driver) throws InterruptedException {

        System.out.println("Check Изменить");
        driver.findElement(By.xpath("//button[@title='Изменить']")).click();
        Thread.sleep(1000);

        System.out.println("Check Удалить");
        driver.findElement(By.xpath("//button[@title='Удалить']")).click();
        Thread.sleep(1000);

        System.out.println("Check Сохранить все изменения");
        driver.findElement(By.xpath("//*[@title='Сохранить все изменения']")).click();
        Thread.sleep(3000);

        System.out.println("Check Сохранить");
        driver.findElement(By.xpath(".//span[contains(text(), 'Сохранить')]")).click();
        Thread.sleep(3000);

    }
    protected void login(RemoteWebDriver driver, String login, String pass) throws InterruptedException {

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
