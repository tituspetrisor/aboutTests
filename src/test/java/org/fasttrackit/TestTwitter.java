package org.fasttrackit;

import org.fasttrackit.pageobjects.Footer;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestTwitter extends TestBase {
    @Test

    public void testTwitter() {
        Footer footer = PageFactory.initElements(driver, Footer.class);
        String linkText = "twitter";
        footer.getLinksBelowConnectWithUs(linkText, driver).click();

        String expectedLink = footer.LinkName(linkText, driver).getText();
        String correctLink = "https://twitter.com/";

        assertThat("Expected https://twitter.com/", expectedLink, not(correctLink));


    }
}
