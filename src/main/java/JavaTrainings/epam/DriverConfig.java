package JavaTrainings.epam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConfig {

    public void config() {
        String exepath = "C:\\Users\\mkara\\Documents\\JavaMP\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exepath);
    }
}
