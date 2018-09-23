package JavaTrainings.epam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2 {

    public void Ex2() throws InterruptedException {

        DriverConfig driverConfig = new DriverConfig();
        driverConfig.config();
        WebDriver driver = new ChromeDriver();

        String url = "https://en.wikipedia.org";
        driver.navigate().to(url);
        Thread.sleep(1000);

        driver.findElement(By.linkText("Help")).click();
        Thread.sleep(1000);

        driver.navigate().back();
        Thread.sleep(1000);

        driver.navigate().forward();
        Thread.sleep(1000);

        driver.navigate().to(url);
        Thread.sleep(1000);

        driver.navigate().refresh();
        Thread.sleep(1000);

        driver.close();
    }
}
