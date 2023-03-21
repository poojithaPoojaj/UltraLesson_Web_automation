package com.ultralesson.webautomations.webplayground.pages;

import com.ultralesson.webautomations.webplayground.models.Item;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage{
    By searchIcon = By.cssSelector("summary[aria-label='Search']");
    By arrowIcon=By.className("icon-arrow");
    By searchBar = By.id("Search-In-Modal");
    By searchResults = By.cssSelector("li[id^='predictive-search-option'] a");

    // Scoped Element
    By productName = By.cssSelector(".predictive-search__item-heading");

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage search(String searchItem) {
        actions.click(searchIcon);
        actions.type(searchBar, searchItem);
        return this;
    }

    public List<Item>   getSearchItems() {

        List<WebElement> elements = waits.waitUntilAllElementsAreVisible(searchResults);
        List<Item> items = new ArrayList<>();
        for(WebElement element : elements) {
            String name =  actions.getChildText(element, productName);
            Item item = new Item();
            item.setName(name);
            items.add(item);
        }
        return items;
    }

}
