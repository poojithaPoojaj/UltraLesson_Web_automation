package com.ultralesson.webautomations.webplayground.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DriverCreator {
public WebDriver createHeadLessBrowser(){
   return new ChromeDriverManager().createHeadlessChromeDriver();
}
    public WebDriver create(String browser) {
        browser = setDefaultBrowser(browser);
        switch (browser.toLowerCase()) {
            case "firefox":
                return new FireFoxDriverManager().create();
            case "edge":
                return new EdgeDriverManager().create();
            default:
                return new ChromeDriverManager().create();
//                WebDriverManager.chromedriver().setup();
//                ChromeOptions options=new ChromeOptions();
//                options.addArguments("--remote-allow-origins=*");
//                return new ChromeDriver(options);

        }
    }


    private String setDefaultBrowser(String browser) {
        if(Objects.isNull(browser) || browser.isEmpty()) {
            browser = "chrome";
        }
        return browser;
    }


    public WebDriver createMobile(String browser) {
        switch (browser.toLowerCase()) {
            case "firefox":
                return new FireFoxDriverManager().createMobile();
            default:
                return new ChromeDriverManager().createMobile();

        }
    }

}
