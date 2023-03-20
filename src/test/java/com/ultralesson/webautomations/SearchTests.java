package com.ultralesson.webautomations;

import com.ultralesson.webautomations.webplayground.models.Item;
import com.ultralesson.webautomations.webplayground.pages.HomePage;
import com.ultralesson.webautomations.webplayground.pages.LauncherPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTests {
    @Test
    public void verifyIfSearchTermShowsRelevantResults() {
        WebDriver webdriver=null;
        String searchItem = "Jeans";
        LauncherPage launcherPage = new LauncherPage(webdriver); // Assume webdriver is created and handy
        launcherPage.navigateTo("https://web-playground.ultralesson.com/");

        //Act
        HomePage homepage = new HomePage(webdriver);
        homepage.search(searchItem);
        List<Item> searchItems = homepage.getSearchItems();

        //Assert
        Assert.assertEquals(4, searchItems.size());
    }
}