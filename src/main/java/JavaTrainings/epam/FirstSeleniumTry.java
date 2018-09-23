package JavaTrainings.epam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTry {

    public static void main(String[] args) throws Throwable {

        String exepath = "C:\\Users\\mkara\\Documents\\JavaMP\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exepath);
        WebDriver driver = new ChromeDriver();

        String url = "https://www.google.com";
        driver.get(url);

        System.out.println("Successfully opened the website https://www.google.com/");

        driver.quit();

        Exercise1 exercise1 = new Exercise1();
        exercise1.Excersise();
    }
}
