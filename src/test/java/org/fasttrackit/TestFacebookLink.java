package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNot.not;

public class TestFacebookLink {

    @Test
    public void testFacebookLink(){
        System.setProperty("webdriver.chrome.driver",
                "src//test//drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.linkText("FACEBOOK"));
        String expectedLink = driver.findElement(By.xpath("//a[./em[@class = 'facebook']]")).getText();
        String correctLink = "https://web.facebook.com/ ";

        assertThat("Expected https://web.facebook.com/", correctLink, not(expectedLink));

    }

}
