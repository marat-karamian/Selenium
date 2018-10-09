package JavaTrainings.epam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomeWork1 {

    public void hw1() throws InterruptedException {

        DriverConfig driverConfig = new DriverConfig();
        driverConfig.chrome();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://facebook.com");
        driver.manage().window().maximize();

        WebElement email = driver.findElement(By.id("email"));
        email.clear();
        email.sendKeys("mkaramyan.dp@gmail.com");

        WebElement pass = driver.findElement(By.id("pass"));
        pass.clear();
        pass.sendKeys("TestPassword");

        driver.findElement(By.id("loginbutton")).submit();

        WebElement newsFeed = driver.findElement(By.xpath("//*[@id=\"navItem_4748854339\"]/a/div"));

        boolean isLogged = newsFeed.isEnabled();
        if (isLogged) {
            System.out.println("The user is logged in");
        } else {
            System.out.println("The user is not logged in");
        }

        driver.quit();
    }
}
