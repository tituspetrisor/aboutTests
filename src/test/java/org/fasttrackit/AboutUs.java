package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AboutUs {

    @Test
    public void aboutUs(){
        System.setProperty("webdriver.chrome.driver",
                "src//test//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.linkText("ABOUT US")).click();
        String story = driver.findElement(By.xpath("//div[@class = 'page-head']")).getText();
        String ourStory = "OUR STORY";

        assertThat("The page about us does'n accessed" ,ourStory, is(story));

    }
}
