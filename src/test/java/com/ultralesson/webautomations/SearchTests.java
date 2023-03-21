package com.ultralesson.webautomations;


import com.ultralesson.webautomations.webplayground.drivers.DriverCreator;
import com.ultralesson.webautomations.webplayground.models.Item;
import com.ultralesson.webautomations.webplayground.pages.HomePage;
import com.ultralesson.webautomations.webplayground.pages.LauncherPage;
import com.ultralesson.webautomations.webplayground.pages.PageWaits;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTests {

    @Test
    public void verifyIfSearchTermShowsRelevantResults() {

        String searchItem = "Jeans";
        String searchKey = "Jean";
        String browser = "chrome";
        WebDriver driver=new DriverCreator().createHeadLessBrowser();
//        WebDriver driver = new DriverCreator().create(browser);
////        WebDriver driver=new DriverCreator().createDriverContext(browser).create();
//        WebDriver driver=new DriverCreator().createMobile(browser);
        LauncherPage launcherPage = new LauncherPage(driver);
        launcherPage.navigateTo("https://web-playground.ultralesson.com/");

        HomePage homepage = new HomePage(driver);
        homepage.search(searchItem);
        List<Item> searchItems = homepage.getSearchItems();
//
//        //Assert
        Assert.assertEquals(4, searchItems.size());
        Assert.assertTrue(searchItems.stream().allMatch(item -> item.getName().contains(searchKey)));

    }

    }
