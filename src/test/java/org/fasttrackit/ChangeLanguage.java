package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeLanguage {

    @Test
            public void changeLanguage() {
        System.setProperty("webdriver.chrome.driver",
                "src//test//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.xpath("//select[@id = 'select-language']")).click();
        driver.findElement(By.xpath("//option[@value = 'https://fasttrackit.org/selenium-test/?___store=german&___from_store=german']")).click();


    }
}
