package org.fasttrackit;

import org.fasttrackit.pageobjects.SiteMenu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Parameterized.class)

public class TestAllPages extends TestBase{

    public TestAllPages(String keyword) {
        this.keyword = keyword;
    }

    private String keyword;

    @Parameterized.Parameters
    public static List<String> inputDate(){
        return Arrays.asList("women", "men", "ACCESSORIES", "home & decor", "saLe", "viP");

    }
    @Test

    public void verifyLinksPages(){

        SiteMenu siteMenu = PageFactory.initElements(driver, SiteMenu.class);
        siteMenu.getLinkName(keyword,driver);
        siteMenu.clickOnLink(keyword, driver);

        String correctName = keyword.toUpperCase();
        String expectedName = siteMenu.getPageTitleFromH();

        assertThat("Expected " + keyword.toUpperCase(), correctName, is(expectedName));
        driver.quit();
    }
}
