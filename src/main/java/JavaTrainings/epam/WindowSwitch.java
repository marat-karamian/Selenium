package JavaTrainings.epam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowSwitch {

    public void switchWindow() throws InterruptedException {

        DriverConfig driverConfig = new DriverConfig();
        driverConfig.config();
        WebDriver driver = new ChromeDriver();
        String url = "http://toolsqa.com/automation-practice-switch-windows";

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(url);
        Thread.sleep(1000);

        String handle = driver.getWindowHandle();
        System.out.println(handle);

        driver.manage().window().maximize();
        //driver.findElement(By.name("New Message Window")).click();
        driver.findElement(By.xpath("//div[@id='content']/p[3]/button")).click();
        Thread.sleep(1000);

        Set handles = driver.getWindowHandles();
        System.out.println(handles);

        for (String handle1 : driver.getWindowHandles()) {
            System.out.println(handle1);
            driver.switchTo().window(handle1);
        }

        Thread.sleep(1000);
        driver.close();

        Thread.sleep(000);
        driver.quit();

    }
}
