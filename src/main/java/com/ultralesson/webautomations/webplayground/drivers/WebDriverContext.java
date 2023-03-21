package com.ultralesson.webautomations.webplayground.drivers;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WebDriverContext {

    private DriverManager<WebDriver> driverManager;

    public WebDriverContext(DriverManager<WebDriver> driverManager) {
        setWebDriver(driverManager);
    }

    public WebDriver create() {
        return driverManager.create();
    }

    public void setWebDriver(DriverManager<WebDriver> driverManager) {
        this.driverManager = driverManager;
    }
}
