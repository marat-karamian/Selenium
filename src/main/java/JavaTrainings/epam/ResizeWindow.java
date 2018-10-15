package JavaTrainings.epam;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;

public class ResizeWindow {

    public void resize() throws InterruptedException {

        DriverConfig driverConfig = new DriverConfig();
        driverConfig.firefox();
        WebDriver driver = new FirefoxDriver();
        Thread.sleep(1000);

        System.out.println(driver.manage().window().getSize());

        driver.manage().window().setSize(new Dimension(500, 600));
        System.out.println(driver.manage().window().getSize());
        Thread.sleep(1000);

        System.out.println(driver.manage().window().getPosition());
        driver.manage().window().setPosition(new Point(200,150));
        System.out.println(driver.manage().window().getPosition());
        Thread.sleep(1000);

        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getSize());
        Thread.sleep(1000);

        driver.manage().window().setPosition(new Point(0,0));
        driver.manage().window().setSize(new Dimension(500,600));
        Thread.sleep(1000);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int Width = toolkit.getScreenSize().width;
        int Height = toolkit.getScreenSize().height;
        Dimension screenResolution = new Dimension(Width, Height);
        driver.manage().window().setSize(screenResolution);
        System.out.println(driver.manage().window().getSize());
        Thread.sleep(2000);

        driver.quit();
    }
}
