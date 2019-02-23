package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNot.not;

public class TestPinterestLink {

    @Test
    public void testPinterestLink(){
        System.setProperty("webdriver.chrome.driver",
                "src//test//drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.linkText("PINTEREST"));
        String expectedLink = driver.findElement(By.xpath("//a[./em[@class = 'pinterest']]")).getText();

        String correctLink = "https://ro.pinterest.com/";

        assertThat("Expected https://ro.pinterest.com/", correctLink, not(expectedLink));


    }
}