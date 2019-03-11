package org.fasttrackit;

import org.fasttrackit.pageobjects.DriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {


    protected WebDriver driver;

    @Before
    public void setup() {
        String browser = System.getProperty("browser", "chrome");

        driver = DriverManager.initDriver(browser);
        driver.get(AppConfig.getSiteUrl());
        System.out.println("Opened homepage");

    }
}