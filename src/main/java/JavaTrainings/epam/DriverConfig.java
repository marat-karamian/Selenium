package JavaTrainings.epam;


public class DriverConfig {

    public void config() {
        String exepath = "C:\\Users\\mkara\\Documents\\JavaMP\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exepath);
    }
}
