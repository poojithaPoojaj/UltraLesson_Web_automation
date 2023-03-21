package com.ultralesson.webautomations.webplayground.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LauncherPage extends BasePage {

    public LauncherPage(WebDriver webDriver) {
       super(webDriver);
    }


    public boolean navigateTo(String url)  {
        webDriver.get(url);
        return isSiteLoaded();
    }

    public boolean isSiteLoaded() {
//        return new WebDriverWait(webDriver,Duration.ofSeconds(20)).until(ExpectedConditions.titleIs("Google"));
        return new WebDriverWait(webDriver, Duration.ofSeconds(30)).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }
}
