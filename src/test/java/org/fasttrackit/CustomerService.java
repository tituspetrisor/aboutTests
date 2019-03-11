package org.fasttrackit;

import org.fasttrackit.pageobjects.Footer;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CustomerService extends TestBase{
    @Test
    public void customerService (){
        Footer footer = PageFactory.initElements(driver, Footer.class);

        String linkText = "Customer Service";
        footer.getLinksBelowCompany(linkText,driver).click();

        String expectedMessage = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        String corectMessage = "CUSTOMER SERVICE";

        assertThat("Customer service it is not accessed", corectMessage, is(expectedMessage));
    }
}
