package Browser_Factory;


import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Browser_Drivers {
    public static WebDriver driver;

    public static void Choose_Browser(String Run_Browser) {
        String browser = Run_Browser; // Change this to "firefox" to launch Firefox

         driver = null;

        if (browser.equalsIgnoreCase("chrome")) {
            // Set up WebDriver for Chrome
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            // Set up WebDriver for Firefox
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            System.out.println("Unsupported browser: " + browser);
            return;
        }


    }
}
