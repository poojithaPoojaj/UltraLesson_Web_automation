package com.ultralesson.webautomations.webplayground.drivers;

import com.ultralesson.webautomations.webplayground.internal.Toggles;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;


public class ChromeDriverManager implements DriverManager<WebDriver>{

    public ChromeOptions getChromeDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        return options;
    }


    @Override
    public WebDriver create() {
        return new ChromeDriver(getChromeDriver());
    }

    public ChromeDriver createHeadlessChromeDriver() {

                ChromeOptions options=getChromeDriver();
                options.addArguments("--headless=new");
                return new ChromeDriver(options);
    }


    public WebDriver createMobile(){
        Map<String, Object> deviceMetrics = new HashMap<>();

        deviceMetrics.put("width", 360);

        deviceMetrics.put("height", 640);

        deviceMetrics.put("pixelRatio", 3.0);

        Map<String, Object> mobileEmulation = new HashMap<>();

        mobileEmulation.put("deviceMetrics", deviceMetrics);

        mobileEmulation.put("userAgent", "Mozilla/5.0 (Linux; Android 4.2.1; en-us; Nexus 5 Build/JOP40D) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19");

        ChromeOptions chromeOptions = new ChromeOptions(); chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

        chromeOptions.addArguments("--remote-allow-origins=*");

        return new ChromeDriver(chromeOptions);
    }
}
