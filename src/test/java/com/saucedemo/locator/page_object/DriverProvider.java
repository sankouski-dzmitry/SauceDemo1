package com.saucedemo.locator.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class DriverProvider {
    private static WebDriver driver = null;

    static WebDriver get() {
        if(driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:/Drivers/ChromeDriver/chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("start-maximized");
            driver = new ChromeDriver(chromeOptions);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get("https://www.saucedemo.com");
        }
        return driver;
    }

    public static void quit() {
        driver.quit();
        driver = null;
    }
}
