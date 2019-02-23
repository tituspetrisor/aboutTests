package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestInStock {

    @Test

    public void isInStock(){
        System.setProperty("webdriver.chrome.driver",
                "src//test//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.id("search")).sendKeys("chelsea tee" + Keys.ENTER);
        driver.findElement(By.xpath("//li[@class = 'item last']//img[@id = 'product-collection-image-409']")).click();

        String expectedMessage = driver.findElement(By.xpath("//div[@class = 'extra-info']//span[@class = 'value']")).getText();
        String correctMessage = "IN STOCK";

        assertThat("Expected IN STOCK", correctMessage, is(expectedMessage));
    }
}
