package com.ultralesson.webautomations.webplayground.drivers;

import com.ultralesson.webautomations.webplayground.internal.Toggles;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;


public class ChromeDriverManager implements DriverManager<WebDriver>{
//    @Override
//    public WebDriver create() {
//        return new io.github.bonigarcia.wdm.managers.ChromeDriverManager().create();
//
//    }


    @Override
    public WebDriver create() {
//        if(Toggles.HEADLESS.isOn()) {
            return createHeadlessChromeDriver();
//        }
//        return new io.github.bonigarcia.wdm.managers.ChromeDriverManager().create();
    }

    public ChromeDriver createHeadlessChromeDriver() {
        WebDriverManager.chromedriver().setup();
                ChromeOptions options=new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
        options.addArguments("--headless=new");
                return new ChromeDriver(options);
////        new io.github.bonigarcia.wdm.managers.ChromeDriverManager().setup();
////        ChromeOptions chromeOptions = getHeadlessChromeOptions();
////        return new ChromeDriver(chromeOptions);
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--headless=new");
//        return chromeOptions;
    }

    private ChromeOptions getHeadlessChromeOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless=new");
        return chromeOptions;
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
