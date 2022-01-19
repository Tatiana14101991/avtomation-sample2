package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Removal {
//removal(driver, "
    public static void login(RemoteWebDriver driver, String change, String delete) throws InterruptedException {

        System.out.println("Check Изменить");
        driver.findElement(By.xpath("//td[7]//*[@title='Изменить']")).click();
        Thread.sleep(1000);

        System.out.println("Check Удалить");
        driver.findElement(By.xpath("//button[@title=\"Удалить\"]")).click();
        Thread.sleep(1000);

        System.out.println("Check Сохранить");
        driver.findElement(By.xpath("//*[@title='Сохранить все изменения']")).click();
        Thread.sleep(3000);

        System.out.println("Check Сохранить все изменения");
        driver.findElement(By.xpath(".//span[contains(text(), 'Сохранить')]")).click();
        Thread.sleep(3000);
    }

}
