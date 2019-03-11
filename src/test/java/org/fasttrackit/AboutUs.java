package org.fasttrackit;

import org.fasttrackit.pageobjects.Footer;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AboutUs extends TestBase{

    @Test
    public void aboutUs(){
        String linkText = "About Us";

        Footer footer = PageFactory.initElements(driver, Footer.class);
        footer.getLinksBelowCompany(linkText, driver).click();

        String story = driver.findElement(By.xpath("//div[@class = 'page-head']")).getText();
        String ourStory = "OUR STORY";

        assertThat("The page about us does'n accessed" ,ourStory, is(story));

    }
}
