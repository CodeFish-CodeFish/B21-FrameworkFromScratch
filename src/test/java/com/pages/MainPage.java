package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='#contentarea']//following-sibling::ul//a[.='Create an Account']")
    WebElement createAccountLink;


    public void clickOnCreateAccount(){
        this.createAccountLink.click();
    }


}
