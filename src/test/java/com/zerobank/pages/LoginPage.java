package com.zerobank.pages;

import com.zerobank.utils.ConfigurationReader;
import com.zerobank.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(css = "div.alert.alert-error")
    private WebElement alertMessage;

    @FindBy(css = "[id='signin_button']")
    private WebElement signinButton;

    @FindBy(css = "[id=user_login]")
    private WebElement userNameInput;

    @FindBy(css = "[id=user_password]")
    private WebElement userPasswordInput;

    public String loginPageTitle = "Zero - Log in";

    private String expectedEnterancePageTitle = "Zero - Personal Banking - Loans - Credit Cards";

    private String username = ConfigurationReader.getProperty("username");

    private String password = ConfigurationReader.getProperty("password");

    public LoginPage() {

        PageFactory.initElements(Driver.get(), this);
    }

    private void sendCredentials(String str1, String str2) {
        utils.waitForPresence(userNameInput, 5);
        userNameInput.sendKeys(str1);
        userPasswordInput.sendKeys(str2, Keys.ENTER);
    }

    @Override
    public boolean atPage() {
        utils.waitForTitle(5);
        return loginPageTitle.equals(Driver.get().getTitle());
    }

    public boolean allertMessageDisplayed() {
        utils.waitForPresence(alertMessage,1);
        return alertMessage.getText().equals("Login and/or password are wrong.");
    }

    public boolean login() {
        sendCredentials(username, password);
        return super.atPage();
    }
    public boolean login(String name, String pass) {
        sendCredentials(name, pass);
        return atPage();
    }
    public boolean correctionOfResult(String choise) {
        boolean result = false;
        switch (choise) {
            case "Message":
                result =  allertMessageDisplayed();
                break;
            case "HomePage":
                result = super.atPage();
                break;
        }
        return result;
    }
    public void getLoginPage() {
        Driver.get().get(ConfigurationReader.getProperty("url"));
        utils.waitForTitle(10);
        Assert.assertTrue(Driver.get().getTitle().equals(expectedEnterancePageTitle));
        utils.waitForPresence(signinButton,1);
        signinButton.click();
    }

}




