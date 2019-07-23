package co.uk.safebear.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    // here we set our url
    private static final String URL = System.getProperty("url", "http://toolslist.safebear.co.uk:8080");
    // here we set our browser
    private static final String BROWSER = System.getProperty("browser", "chrome");

    // a method command for getting our URL
    public static String getUrl() {
        return URL;
    }

    // a method/command for getting the Driver for our Browser

    public static WebDriver getDriver() {

        ChromeOptions chromeOptions;
        switch (BROWSER.toUpperCase()) {

            case "CHROME":
                // Tell the user which browser we're running our tests on
                System.out.println("Executing on CHROME");

                // Use 'WebDriverManager' to setup our chromedriver
                WebDriverManager.chromedriver().setup();

                // Return our Driver
                return new ChromeDriver();


            case "FIREFOX":
                // Tell the user which browser we're running our tests on
                System.out.println(" Executing on FIREFOX");
                // Use 'WebDriverManager' to setup our firefoxdriver
                WebDriverManager.firefoxdriver().setup();
                // Return our Driver
                return new FirefoxDriver();

            default:
                throw new IllegalArgumentException("The Browser Type is Undefined");
        }
    }
}
