package org.fasttrackit;

import org.fasttrackit.pageobjects.Footer;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNot.not;

public class TestFacebookLink extends TestBase {

    @Test
    public void testFacebookLink(){
        Footer footer = PageFactory.initElements(driver, Footer.class);

        String linkText = "facebook";
        footer.getLinksBelowConnectWithUs(linkText, driver).click();

        String expectedLink = footer.LinkName(linkText, driver).getText();
        String correctLink = "https://web.facebook.com/ ";

        assertThat("Expected https://web.facebook.com/", correctLink, not(expectedLink));

    }

}
