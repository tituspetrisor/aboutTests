package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class RegisterTest{

    @Test
public void registerTestForUsers(){
        System.setProperty("webdriver.chrome.driver",
        "src//test//drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.linkText("ACCOUNT")).click();
        driver.findElement((By.linkText("Register"))).click();
        driver.findElement(By.id("firstname")).sendKeys("Titus");
        driver.findElement(By.id("lastname")).sendKeys("Petrisor");
        driver.findElement(By.className("validate-email")).sendKeys("titus.p@yahoo.com");
        driver.findElement(By.id("password")).sendKeys("TestRegister");
        driver.findElement(By.id("confirmation")).sendKeys("TestRegister");
        driver.findElement(By.id("is_subscribed")).click();
        driver.quit();
        }

}
