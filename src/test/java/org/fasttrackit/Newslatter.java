package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Newslatter {
    @Test
    public void subcribeToNewslatter(){
        System.setProperty("webdriver.chrome.driver",
                "src//test//drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.xpath("//div[@class = 'input-box']//input[@id = 'newsletter']")).sendKeys("titus.p@yahoo.com");
        driver.findElement(By.xpath("//div[@class = 'actions']//button[@title = 'Subscribe']")).click();

        String expectdMessage = driver.findElement(By.xpath("//div[@class ='col-main']//li[@class = 'success-msg'] ")).getText();
        String corectMessage = "Thank you for your subscription.";

        assertThat("Expected a successful message", corectMessage, is(expectdMessage));
    }
}
