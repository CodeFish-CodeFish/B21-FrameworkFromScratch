package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class CreateAccountPage {

    public CreateAccountPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#firstname")
    WebElement firstname;

    @FindBy(css = "#lastname")
    WebElement lastname;

    @FindBy(css = "#email_address")
    WebElement email;

    @FindBy(css = "input[id='password']")
    WebElement password;

    @FindBy(css = "input[id='password-confirmation']")
    WebElement confirmPassword;

    @FindBy(css = "button[class='action submit primary']")
    WebElement createAccountBtn;

    @FindBy(xpath = "//div[.='Thank you for registering with Main Website Store.']")
    WebElement successMessage;

    public void firstAndLastNames(String firstname, String lastname){
        this.firstname.sendKeys(firstname);
        this.lastname.sendKeys(lastname);
    }
    public void emailAndPassword(String email, String password){
        this.email.sendKeys(email);
        this.password.sendKeys(password);
    }

    public void setConfirmPassword(String confirmPassword){
        this.confirmPassword.sendKeys(confirmPassword);
    }

    public void clickOnCreateAccountBtn(){
        this.createAccountBtn.click();
    }

    public void validateSuccessMessage(String successMessage){
        Assert.assertEquals(successMessage, BrowserUtils.getText(this.successMessage));
    }









}
