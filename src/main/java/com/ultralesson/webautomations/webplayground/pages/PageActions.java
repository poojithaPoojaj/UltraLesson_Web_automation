package com.ultralesson.webautomations.webplayground.pages;

import org.openqa.selenium.*;

import java.io.File;

public class PageActions {
    private WebDriver webDriver;
    private PageWaits waits;

    public PageActions(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.waits = new PageWaits(webDriver);
    }

    public void click(By by) {
        waits.waitForElementToBePresent(by).click();
    }

    public void type(By by, String value) {
        waits.waitForElementToBePresent(by).sendKeys(value);
    }
    public String  getChildText(WebElement element,By by){
       WebElement webElement= waits.waitForElementToBePresent(element);
       return webElement.findElement(by).getText();
    }
    public File takeScreenShot(){
        TakesScreenshot scrShot =((TakesScreenshot)webDriver);
        return scrShot.getScreenshotAs(OutputType.FILE);
    }
}
