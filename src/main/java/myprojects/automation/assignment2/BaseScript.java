package myprojects.automation.assignment2;

import myprojects.automation.assignment2.utils.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Base script functionality, can be used for all Selenium scripts.
 */
public abstract class BaseScript {


    private static ChromeDriver getChromeDriver(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
        return new ChromeDriver();
    }

    private static FirefoxDriver getfirefoxDriver(){
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/resources/geckodriver.exe");
        return new FirefoxDriver();
    }

    private static InternetExplorerDriver getInternetExplorerDriver() {
        System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/src/main/resources/IEDriverServer.exe");
        return new InternetExplorerDriver();
    }

    /**
     *
     * @return New instance of {@link WebDriver} object.
     */
    public static WebDriver getDriver() {
        // TODO return  WebDriver instance
        String browser = Properties.getBrowser();
        switch (browser.toLowerCase()) {
            case "chrome":
                return getChromeDriver();
            case "firefox":
                return getfirefoxDriver();
            case "ie":
            case "internet explorer":
                return getInternetExplorerDriver();
            default:
                System.out.println("Unsupported browser type!");
                throw new UnsupportedOperationException("Method doesn't return WebDriver instance");
        }
    }
}
