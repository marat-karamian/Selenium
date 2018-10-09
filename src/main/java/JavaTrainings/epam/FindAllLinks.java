package JavaTrainings.epam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindAllLinks {

    public void allLinks() {

        DriverConfig driverConfig = new DriverConfig();
        driverConfig.chrome();
        WebDriver driver = new ChromeDriver();

        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        for (int i=0; i<links.size(); i++) {
            System.out.println(i + " " + links.get(i).getText());
        }

        driver.quit();
    }
}
