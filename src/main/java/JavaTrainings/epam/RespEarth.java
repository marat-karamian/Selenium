package JavaTrainings.epam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RespEarth {

    public void earth() throws InterruptedException {

        DriverConfig driverConfig = new DriverConfig();
        driverConfig.chrome();
        WebDriver driver = new ChromeDriver();

        String url = "http://resp-earth.ctco-ecom.projects.epam.com";
        driver.get(url);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"input_0\"]")).sendKeys("sd100m");
        driver.findElement(By.xpath("//*[@id=\"input_1\"]")).sendKeys("sd100m");
        driver.findElement(By.cssSelector("body > mc-site > div > div > div > form > md-card > md-card-content > md-card-actions > button")).click();

        Thread.sleep(3000);

        driver.quit();
    }
}