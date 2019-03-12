package org.fasttrackit;

import org.fasttrackit.pageobjects.Header;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import javax.sql.rowset.spi.SyncFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestInStock extends TestBase{

    @Test

    public void isInStock(){
        Header header = PageFactory.initElements(driver, Header.class);
        String keyword = "chelsea tea";

        header.search(keyword);
        header.getSearchButton();


        driver.findElement(By.xpath("//li[@class = 'item last']//img[@id = 'product-collection-image-409']")).click();
        String expectedMessage = driver.findElement(By.xpath("//div[@class = 'extra-info']//span[@class = 'value']")).getText();
        String correctMessage = "IN STOCK";
        assertThat("Expected IN STOCK", correctMessage, is(expectedMessage));
    }
}
