package utils;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementHelper {

    RemoteWebDriver driver;
    WebDriverWait wait;

    public ElementHelper(RemoteWebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(PropertiesReader.getProperty("webDriverWait"))));
    }


    public WebElement findElement(By by) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        scroll(by);
        return element;
    }

    public void click(By by) {
        findElement(by).click();
    }

    public String getText(By by) {
        return findElement(by).getText();
    }


    public String getAttr(By by,String attr) {
        return findElement(by).getAttribute(attr);
    }

    public void scroll(By by) {
        if (PropertiesReader.getProperty("client").equals("Web")) {
            driver.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", driver.findElement(by));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
