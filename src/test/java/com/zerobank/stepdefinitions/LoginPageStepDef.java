package com.zerobank.stepdefinitions;

import com.zerobank.utils.Driver;
import com.zerobank.utils.PageObjects;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.CucumberOptions;
import org.junit.Assert;

import java.util.Optional;

public class LoginPageStepDef {
    PageObjects page = new PageObjects();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {

        Assert.assertTrue("User is not on the login Page",page.loginPage.atPage());
    }

    @When("Enter credentials")
    public void enteredCredentials() {
        Assert.assertTrue("problem occured after loging in",page.loginPage.login());

    }

    @When("Entered {string} {string} credentials")
    public void enteredCredentials(String arg0,String arg1) {

        Assert.assertTrue("problem occured after invalid credentials entered",page.loginPage.login(arg0, arg1));
    }

    @Then("{string} should be displayed")
    public void shouldBeDisplayed(String arg0) {

        Assert.assertTrue("the result of test couldn't be corrected",page.loginPage.correctionOfResult(arg0));

    }



}


