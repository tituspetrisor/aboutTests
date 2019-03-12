package org.fasttrackit.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Footer  {


    @FindBy(id = "search")
    private WebElement searchField;

    @FindBy(className = "search-button")
    private WebElement searchButton;

    @FindBy(id = "newsletter")
    private WebElement newslatter;

    @FindBy(xpath = "//span[text() = 'Subscribe']")
    private WebElement pushButton;


    public WebElement getLinksBelowCompany(String linksBelowCompany, WebDriver driver){
        return driver.findElement(By.xpath("//div[@class = 'links']//ul//a[text() = '" + linksBelowCompany + "']"));
    }
    public WebElement getLinksBelowConnectWithUs(String linksBelowConnect, WebDriver driver){
        return driver.findElement(By.xpath("//a[./em[@class = '" + linksBelowConnect.toLowerCase() +"']]"));
    }
    public WebElement LinkName(String linkName, WebDriver driver){
        return driver.findElement(By.xpath("//a[./em[@class = '" + linkName.toLowerCase() + "']]"));
    }


    public void insertEmail(String keyword){
        newslatter.sendKeys(keyword);
        pushButton.click();

    }




    public void search(String keyword){

        searchField.sendKeys(keyword);
        searchButton.click();
    }

    public WebElement getSearchButton(){
        return searchButton;
    }

}
