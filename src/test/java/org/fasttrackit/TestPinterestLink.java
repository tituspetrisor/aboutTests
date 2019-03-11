package org.fasttrackit;

import org.fasttrackit.pageobjects.Footer;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNot.not;

public class TestPinterestLink extends TestBase{

    @Test
    public void testPinterestLink(){
        Footer footer = PageFactory.initElements(driver, Footer.class);
        String linkText = "pinterest";

        footer.getLinksBelowConnectWithUs(linkText, driver).click();
        String expectedLink = footer.LinkName(linkText, driver).getText();
        String correctLink = "https://ro.pinterest.com/";

        assertThat("Expected https://ro.pinterest.com/", correctLink, not(expectedLink));


    }
}
