package org.fasttrackit;

import org.fasttrackit.pageobjects.Footer;
import org.fasttrackit.pageobjects.Header;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Newslatter extends TestBase{
    @Test
    public void subcribeToNewslatter(){
        Header header = PageFactory.initElements(driver, Header.class);
        String email = "titus.p@yahoo.com";
        header.insertEmail(email);

        String expectdMessage = driver.findElement(By.xpath("//div[@class ='col-main']//li[@class = 'success-msg'] ")).getText();
        String corectMessage = "Thank you for your subscription.";

        assertThat("Expected a successful message", corectMessage, is(expectdMessage));
    }
}
