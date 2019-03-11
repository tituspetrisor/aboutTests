package org.fasttrackit;

import org.fasttrackit.pageobjects.Footer;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactUs extends TestBase{

    @Test

    public void contactUs(){
        Footer footer = PageFactory.initElements(driver, Footer.class);

        String linkText = "Contact Us";
        footer.getLinksBelowCompany(linkText,driver).click();

        driver.findElement(By.id("name")).sendKeys("Titus");
        driver.findElement(By.id("email")).sendKeys("titus.p@yahoo.com");
        driver.findElement(By.id("comment")).sendKeys("This page it is work");
        driver.findElement(By.xpath("//button[@class = 'button']")).click();
        String expectedMessage = driver.findElement(By.xpath("//div[@id= 'messages_product_view' ]//li[@class = 'success-msg']")).getText();

        String successfulMessage = "Your inquiry was submitted and will be responded to as soon as possible. Thank you for contacting us.";

        assertThat("The message it is not sent", successfulMessage, is(expectedMessage));

    }
}
