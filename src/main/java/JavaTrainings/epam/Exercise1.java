package JavaTrainings.epam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {

    public void ex1() {

        DriverConfig driverConfig = new DriverConfig();
        driverConfig.chrome();
        WebDriver driver = new ChromeDriver();

        String url = "https://en.wikipedia.org";
        driver.get(url);
        String title = driver.getTitle();
        int titleLength = driver.getTitle().length();

        System.out.println("The title of the page is " + title);
        System.out.println("The title length is " + titleLength);

        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(url)) {
            System.out.println("Verification successful - the correct URL is opened");
        } else {
            System.out.println("Verification failed - an incorrect URL is opened");
            System.out.println("Actual URL is " + actualUrl);
            System.out.println("Expected URL is " + url);
        }

        String pageSource = driver.getPageSource();
        int pageSourceLength = driver.getPageSource().length();

        System.out.println("Total length of Page Source is " + pageSourceLength);

        driver.quit();

    }
}
