package com.zerobank.stepdefinitions;

import com.zerobank.utils.ConfigurationReader;
import com.zerobank.utils.Driver;
import com.zerobank.utils.PageObjects;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hook {
    PageObjects page = new PageObjects();

    @Before
    public void startUp(){
        page.loginPage.getLoginPage();

    }
    @After
    public void tearDown(){
        Driver.close();
    }
}
