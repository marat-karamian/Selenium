package JavaTrainings.epam;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Alerts {

    public void alert() throws InterruptedException {
        DriverConfig driverConfig = new DriverConfig();
        driverConfig.chrome();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String url = "http://toolsqa.com/automation-practice-switch-windows";
        driver.get(url);

        driver.findElement(By.id("alert")).click();

        Alert myAlert = driver.switchTo().alert();

        Thread.sleep(5000);

        myAlert.accept();

        driver.close();
    }
}
