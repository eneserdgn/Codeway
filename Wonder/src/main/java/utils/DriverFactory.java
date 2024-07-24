package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverFactory {

    static ThreadLocal<RemoteWebDriver> remoteWebDriver = new ThreadLocal<>();

    public static void setDriver() {
        String client = PropertiesReader.getProperty("client");
        switch (client) {
            case "Web":
                createWebDriver();
                break;
            case "Android":
                createAndroidDriver();
                break;
            case "IOS":
                createIOSDriver();
                break;
            default:
                System.out.println("Lütfen doğru bir client giriniz!");
                break;
        }
    }

    public static RemoteWebDriver getDriver() {
        return remoteWebDriver.get();
    }

    public static void closeDriver() {
        remoteWebDriver.get().quit();
    }

    public static void createWebDriver() {
        remoteWebDriver.set((RemoteWebDriver) WebDriverManager.chromedriver().create());
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Integer.parseInt(PropertiesReader.getProperty("pageLoadTimeOut"))));
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(PropertiesReader.getProperty("implictyWait"))));

    }

    public static void createAndroidDriver() {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.codeway.wonder");
        options.setAppActivity("com.codeway.wonder.MainActivity");
        try {
            remoteWebDriver.set(new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createIOSDriver() {
        XCUITestOptions options = new XCUITestOptions();
        options.setPlatformName("iOS");
        options.setAutomationName("XCUITest");
        options.setUdid("");
        options.setBundleId("");
        try {
            remoteWebDriver.set(new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), options));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

}
