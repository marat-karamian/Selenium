package JavaTrainings.epam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RespEarth {

    public void earth() throws InterruptedException {

        DriverConfig driverConfig = new DriverConfig();
        driverConfig.chrome();
        WebDriver driver = new ChromeDriver();

        String url = "http://resp-earth.ctco-ecom.projects.epam.com";
        driver.get(url);

        Thread.sleep(3000);

        driver.quit();
    }
}
