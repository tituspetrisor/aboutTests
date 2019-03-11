package org.fasttrackit.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.support.FindBy;

public class Header {

    @FindBy(id = "search")
    private WebElement searchField;

    @FindBy(className = "search-button")
    private WebElement searchButton;

    @FindBy(id = "newsletter")
    private WebElement newslatter;

    @FindBy(xpath = "//span[text() = 'Subscribe']")
    private WebElement pushButton;


    public void insertEmail(String keyword){
        newslatter.sendKeys(keyword);
        pushButton.click();

    }
    public void search(String keyword){

        searchField.sendKeys(keyword);
        searchButton.click();
    }




    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getSearchButton(){
        return searchButton;
    }
}
