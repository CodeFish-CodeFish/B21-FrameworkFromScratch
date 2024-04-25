package com.step_definitions;

import com.pages.CreateAccountPage;
import com.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class StepDef {

    WebDriver driver = LumaHook.driver;

    MainPage mainPage = new MainPage(driver);

    CreateAccountPage accountPage = new CreateAccountPage(driver);

    @Given("user is on main page of Luma user clicks on create account link")
    public void user_is_on_main_page_of_luma_user_clicks_on_create_account_link() {
        mainPage.clickOnCreateAccount();
    }
    @Then("user enters firstname and lastname as follows")
    public void user_enters_firstname_and_lastname_as_follows(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> map = dataTable.asMap();
        accountPage.firstAndLastNames(map.get("firstName"), map.get("lastname"));

    }
    @Then("user enters email and password as follows")
    public void user_enters_email_and_password_as_follows(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> map = dataTable.asMap();
        accountPage.emailAndPassword(map.get("email"), map.get("password"));
    }
    @Then("user confirms entered password as follows")
    public void user_confirms_entered_password_as_follows(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> map = dataTable.asMap();
        accountPage.setConfirmPassword(map.get("confirmPassword"));
    }
    @Then("user clicks on create account button")
    public void user_clicks_on_create_account_button() {
        accountPage.clickOnCreateAccountBtn();
    }
    @Then("user validates success message as follows")
    public void user_validates_success_message_as_follows(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> map = dataTable.asMap();
        accountPage.validateSuccessMessage(map.get("successMessage"));
    }


}
