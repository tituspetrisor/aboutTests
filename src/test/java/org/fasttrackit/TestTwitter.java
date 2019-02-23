package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestTwitter {
    @Test

    public void testTwitter(){
        System.setProperty("webdriver.chrome.driver",
                "src//test//drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.linkText("TWITTER")).click();

        String expectedLink = driver.findElement(By.xpath("//a[./em[@class = 'twitter']]")).getText();

        String correctLink = "https://twitter.com/";


        assertThat("Expected https://twitter.com/", expectedLink, not(correctLink));



                }
}
