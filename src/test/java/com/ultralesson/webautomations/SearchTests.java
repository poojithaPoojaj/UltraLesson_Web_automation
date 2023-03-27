package com.ultralesson.webautomations;


import com.ultralesson.webautomations.webplayground.drivers.DriverCreator;
import com.ultralesson.webautomations.webplayground.e2e.Product;
import com.ultralesson.webautomations.webplayground.models.Item;
import com.ultralesson.webautomations.webplayground.pages.HomePage;
import com.ultralesson.webautomations.webplayground.pages.LauncherPage;
import com.ultralesson.webautomations.webplayground.pages.PageWaits;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.List;

@Epic("Search")
    @Feature("Relevant Search")
    public class SearchTests {
//        @Test(description = "When a user searches with a keyword, " +
//                "relevant results for the keyword should be displayed to the user.")
//        @Story("Verify If Search Term Shows Relevant Results")
//        @Severity(SeverityLevel.CRITICAL)
//
//        public void chromeTest(){
//            String searchItem = "Jeans";
//            String searchKey = "Jean";
//            String browser = "chrome";
//            WebDriver webDriver = new DriverCreator().create(browser);
//            LauncherPage launcherPage = new LauncherPage(webDriver);
//            launcherPage.navigateTo("https://web-playground.ultralesson.com/");
////
//        }
//    @Test(description = "When a user searches with a keyword, " +
//            "relevant results for the keyword should be displayed to the user.")
//    @Story("Verify If Search Term Shows Relevant Results")
//    @Severity(SeverityLevel.CRITICAL)
//        public void firefoxTest(){
//            String searchItem = "Jeans";
//            String searchKey = "Jean";
//            String browser = "firefox";
//            WebDriver webDriver = new DriverCreator().create(browser);
//            LauncherPage launcherPage = new LauncherPage(webDriver);
//            launcherPage.navigateTo("https://web-playground.ultralesson.com/");
//
//        }
//    @Test(description = "When a user searches with a keyword, " +
//            "relevant results for the keyword should be displayed to the user.")
//    @Story("Verify If Search Term Shows Relevant Results")
//    @Severity(SeverityLevel.CRITICAL)
//        public void mobileTest(){
//            String searchItem = "Jeans";
//            String searchKey = "Jean";
//            String browser = "chrome";
//            WebDriver webDriver = new DriverCreator().createMobile(browser);
//            LauncherPage launcherPage = new LauncherPage(webDriver);
//            launcherPage.navigateTo("https://web-playground.ultralesson.com/");
////
//        }
//
//}
//        public void verifyIfSearchTermShowsRelevantResults() {
//            //Arrange
//            String searchItem = "Jeans";
//            String searchKey = "Jean";
//            String browser = "chrome";
//            WebDriver webDriver = new DriverCreator().create(browser);
//            LauncherPage launcherPage = new LauncherPage(webDriver);
//            launcherPage.navigateTo("https://web-playground.ultralesson.com/");
//
//            //Act
////            HomePage homepage = new HomePage(webDriver);
////            homepage.search(searchItem);
////            List<Item> searchProducts = homepage.getSearchItems();
////
////            //Assert
////            Assert.assertEquals(4, searchProducts.size());
////            Assert.assertTrue(searchProducts.stream().allMatch(product -> product.getName().contains(searchKey)));
//        }
//    }
//
//public class SearchTests{
//    @Test
//    public void verifyIfSearchTermShowsRelevantResults(){
//        String searchItem = "Jeans";
//        String searchKey = "Jean";
//        String browser = "edge";
////        WebDriver driver=new DriverCreator().createHeadLessBrowser();
//        WebDriver driver = new DriverCreator().create(browser);
//////        WebDriver driver=new DriverCreator().createDriverContext(browser).create();
////        WebDriver driver=new DriverCreator().createMobile(browser);
//        LauncherPage launcherPage = new LauncherPage(driver);
//        launcherPage.navigateTo("https://web-playground.ultralesson.com/");
//        System.out.println(driver.getTitle());
//
//    }
}