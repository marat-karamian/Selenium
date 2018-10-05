package JavaTrainings.epam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

    public void FF() throws InterruptedException {

        DriverConfig driverConfig = new DriverConfig();
        driverConfig.firefox();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://docs.seleniumhq.org/docs/");

        System.out.println("Successfully opened http://docs.seleniumhq.org/docs/");

        driver.quit();
    }
}
