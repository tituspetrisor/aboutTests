package org.fasttrackit;

import org.fasttrackit.pageobjects.Footer;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNot.not;

public class TestYoutubeLink extends TestBase{

    @Test
    public void youtubeLink(){
        Footer footer = PageFactory.initElements(driver, Footer.class);
        String linkText = "Youtube";

        footer.getLinksBelowConnectWithUs(linkText, driver).click();
        String expectedLink = footer.LinkName(linkText, driver).getText();
        String correctLink = "https://www.youtube.com/";

        assertThat("Expected https://www.youtube.com/", correctLink, not(expectedLink));

    }
}
