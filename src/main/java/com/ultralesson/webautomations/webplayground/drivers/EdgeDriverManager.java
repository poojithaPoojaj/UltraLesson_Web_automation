package com.ultralesson.webautomations.webplayground.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EdgeDriverManager implements DriverManager<WebDriver> {
    @Override
    public WebDriver create() {
        WebDriverManager.edgedriver().driverVersion("111.0.1661.51").setup();
        EdgeOptions options=new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        return new EdgeDriver(options);
//        System.setProperty("webdriver.edge.verboseLogging", "true");
//        EdgeDriverService service = EdgeDriverService.createDefaultService();

//        EdgeDriver driver = new EdgeDriver(service);
//        WebDriverManager.firefoxdriver().driverVersion("0.32.2");
//        return new FirefoxDriver();
//        EdgeOptions options = new EdgeOptions();
//        options.addArguments("--remote-allow-origins=*");
//       return new EdgeDriver();
    }
}
