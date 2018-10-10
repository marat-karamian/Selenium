package JavaTrainings.epam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckRadioBtn {

    public void btn() throws InterruptedException {

        DriverConfig driverConfig = new DriverConfig();
        driverConfig.chrome();
        WebDriver driver = new ChromeDriver();

        driver.get("http://toolsqa.com/automation-practice-form");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> rdBtnSex = driver.findElements(By.name("sex"));
        boolean bValue = rdBtnSex.get(0).isSelected();

        Thread.sleep(2000);

        if (bValue == true) {
            rdBtnSex.get(1).click();
        } else {
            rdBtnSex.get(0).click();
        }

        Thread.sleep(2000);

        WebElement rdBtnExp = driver.findElement(By.id("exp-2"));
        rdBtnExp.click();

        List<WebElement> profChkBox = driver.findElements(By.name("profession"));
        int iSize = profChkBox.size();

        Thread.sleep(2000);

        for (int i=0; i<iSize; i++) {
            String sValue = profChkBox.get(i).getAttribute("value");
            if (sValue.equalsIgnoreCase("Automation Tester")) {
                profChkBox.get(i).click();
                break;
            }
        }

        Thread.sleep(2000);
        WebElement aTool = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
        aTool.click();

        Thread.sleep(2000);

        driver.quit();

    }
}
