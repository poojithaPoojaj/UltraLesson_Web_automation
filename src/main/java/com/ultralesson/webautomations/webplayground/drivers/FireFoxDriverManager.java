package com.ultralesson.webautomations.webplayground.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverManager implements DriverManager<WebDriver>{
    @Override
    public WebDriver create() {
        WebDriverManager.firefoxdriver().driverVersion("0.32.2");
        return new FirefoxDriver();

    }

    public WebDriver createMobile(){
        return null;
    }
}
