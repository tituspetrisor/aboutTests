package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactUs {

    @Test

    public void contactUs(){
        System.setProperty("webdriver.chrome.driver",
                "src//test//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.linkText("CONTACT US")).click();
        driver.findElement(By.id("name")).sendKeys("Titus");
        driver.findElement(By.id("email")).sendKeys("titus.p@yahoo.com");
        driver.findElement(By.id("comment")).sendKeys("This page it is work");
        driver.findElement(By.xpath("//button[@class = 'button']")).click();
        String expectedMessage = driver.findElement(By.xpath("//div[@id= 'messages_product_view' ]//li[@class = 'success-msg']")).getText();

        String successfulMessage = "Your inquiry was submitted and will be responded to as soon as possible. Thank you for contacting us.";

        assertThat("The message it is not sent", successfulMessage, is(expectedMessage));

    }
}
