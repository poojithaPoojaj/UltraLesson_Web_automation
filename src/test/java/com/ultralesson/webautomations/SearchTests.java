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
        WebDriver webdriver = null;
        String searchItem = "Jeans";
        LauncherPage launcherPage = new LauncherPage(webdriver); // Assume webdriver is created and handy
        launcherPage.navigateTo("https://web-playground.ultralesson.com/");

        //Act
        HomePage homepage = new HomePage(webdriver);
        homepage.search(searchItem);
        List<Item> searchItems = homepage.getSearchItems();
        Item resultItem = null;
        for (int i = 0; i < searchItems.size(); i++) {
            if (searchItems.get(i).getName().equalsIgnoreCase("Jeans")) {
                resultItem = searchItems.get(i);
                break;
            }
            //Assert
            Assert.assertEquals(4, searchItems.size());
            Assert.assertEquals(resultItem.getName(), "Jeans");
        }
    }

    @Test
    public void veriftAbleToSearchUnAvailableProduct() {
        WebDriver webdriver = null;
        String searchItem = "Jeans";

        LauncherPage launcherPage = new LauncherPage(webdriver); // Assume webdriver is created and handy
        launcherPage.navigateTo("https://web-playground.ultralesson.com/");

        //Act
        HomePage homepage = new HomePage(webdriver);
        homepage.search(searchItem);
        List<Item> searchItems = homepage.getSearchItems();
        for (int i = 0; i < searchItems.size(); i++) {
            if (searchItems.get(i).getName().equalsIgnoreCase("Jeans")) {
                Assert.assertEquals(true, false);
                return;
            }
        }
        Assert.assertEquals(false, false);
    }

    @Test
    public void veriftItemsAreListedBasedOnBrand() {
        WebDriver webdriver = null;
        String searchItem = "Jeans";
        LauncherPage launcherPage = new LauncherPage(webdriver); // Assume webdriver is created and handy
        launcherPage.navigateTo("https://web-playground.ultralesson.com/");

        //Act
        HomePage homePage = new HomePage(webdriver);
        homePage.search(searchItem);
        List<Item> searchItems = homePage.getSearchItems();

        //Assert
        Assert.assertEquals(4, searchItems.size());
    }


        @Test
        public void verifyResultPageItemsAreEqualToDisplayedItems () {
            WebDriver webdriver = null;
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
