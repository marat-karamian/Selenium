package JavaTrainings.epam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTry {

    public void First() {

        DriverConfig driverConfig = new DriverConfig();
        driverConfig.chrome();
        WebDriver driver = new ChromeDriver();

        String url = "https://www.google.com";
        driver.get(url);

        System.out.println("Successfully opened the website https://www.google.com/");

        driver.quit();
    }
}
