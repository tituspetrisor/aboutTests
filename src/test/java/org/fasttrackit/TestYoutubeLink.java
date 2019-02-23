package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNot.not;

public class TestYoutubeLink {

    @Test
    public void youtubeLink(){
        System.setProperty("webdriver.chrome.driver",
                "src//test//drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.linkText("YOUTUBE"));
        String expectedLink = driver.findElement(By.xpath("//a[./em[@class = 'youtube']]")).getText();
        String correctLink = "https://www.youtube.com/";

        assertThat("Expected https://www.youtube.com/", correctLink, not(expectedLink));

    }
}
