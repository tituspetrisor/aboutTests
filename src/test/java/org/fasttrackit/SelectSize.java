package org.fasttrackit;

import org.fasttrackit.pageobjects.Header;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SelectSize extends TestBase{
    @Test

    public void selectSize() {

        Header header = PageFactory.initElements(driver, Header.class);
        String keyword = "chelsea tee";

        header.search(keyword);
        header.getSearchButton();

        driver.findElement(By.xpath("//img[@id = 'product-collection-image-409']")).click();
        driver.findElement(By.xpath("//div[@class = 'input-box']//li[@id='option79']")).click();
        String exepectedSize = driver.findElement(By.xpath("//div[@class = 'input-box']//li[@id='option79']")).getText();
        String correctSize = "M";
        String displayedSize = driver.findElement(By.xpath("//span[@id = 'select_label_size']")).getText();


        assertThat("It is not the same size ",exepectedSize, is(displayedSize));
    }
}
