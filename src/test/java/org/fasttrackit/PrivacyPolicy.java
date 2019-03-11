package org.fasttrackit;

import org.fasttrackit.pageobjects.Footer;
import org.hamcrest.core.StringContains;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;

public class PrivacyPolicy extends TestBase{

    @Test
    public void testPrivactyPolicy(){
        Footer footer = PageFactory.initElements(driver, Footer.class);

        String linkText = "Privacy Policy";
        footer.getLinksBelowCompany(linkText, driver).click();

        String succesMessage = "is operated by Madison Island";
        String expectedMessage = driver.findElement(By.xpath("//div[@class = 'std']//p[@style = 'border-bottom: 1px solid #e6e6e6; padding-bottom: 18px; padding-top: 10px;']")).getText();

        assertThat("This page does not contain the expected message", expectedMessage, new StringContains(succesMessage));

    }
}
