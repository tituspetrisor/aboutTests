package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishListTest extends TestBase {

    @Test
    public void navigateThroughWishList(){


        driver.findElement(By.linkText("SALE")).click();
        driver.findElement(By.linkText("VIEW DETAILS")).click();
        driver.findElement(By.className("link-wishlist")).click();
        driver.quit();
    }

}
