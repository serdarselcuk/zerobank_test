package com.zerobank.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver {
    private static WebDriver driver;

    private Driver(){

    }
    public static WebDriver get(){
        String browser = ConfigurationReader.getProperty("browser");

        if(driver == null) {
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "chrome_headless":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    options.setHeadless(true);
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "firefox_headless":
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions options1 = new FirefoxOptions();
                    options1.setHeadless(true);
                    driver = new FirefoxDriver();
                    break;
                default:
                    throw new RuntimeException("Browser couldn't initialized");
            }
        }

         return driver;

    }
    public static void close() {
        //if driver still exist
        if (driver != null) {
            //close all browsers
            driver.quit();
            //destroy driver object, ready for gc
            driver = null;
        }
    }
}
