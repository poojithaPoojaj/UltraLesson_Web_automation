package com.ultralesson.webautomations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;

import static org.testng.Assert.*;

public class WebPlayGroundTest {



    public void verifyIfSearchTermShowsRelevantResults(){
        String searchItem = "Jeans";
        LauncherPage launcherPage = new LauncherPage(); // Assume webdriver is created and handy
        launcherPage.navigateTo("https://web-playground.ultralesson.com/");

        //Act
        HomePage homepage = new HomePage(webdriver);
        homepage.search(searchItem);
        List<Item> searchItems = homepage.getSearchItems();

        //Assert
        Assert.assertEquals(4, searchItems.size());
    }
}