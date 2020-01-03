package com.zerobank.pages;

import com.zerobank.utils.BrowserUtils;
import com.zerobank.utils.ConfigurationReader;
import com.zerobank.utils.Driver;

public class BasePage {

    protected BrowserUtils utils = new BrowserUtils();

    private String expectedHomePageTitle ="Zero - Account Summary";


    boolean atPage(){
        utils.waitForTitle(10);
        return expectedHomePageTitle.equals(Driver.get().getTitle());
    }
}
