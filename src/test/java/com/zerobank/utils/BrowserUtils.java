package com.zerobank.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

    public void wait(int seccond){
        try {
            Thread.sleep(seccond*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void waitForPresence(WebElement webElement, int time){
        WebDriverWait wait = new WebDriverWait(Driver.get(),time);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));

    }
    public void waitForClickable(WebElement webElement, int time){
        WebDriverWait wait = new WebDriverWait(Driver.get(),time);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));

    }
    public void waitForElementSelected(WebElement webElement, int time) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), time);
        wait.until(ExpectedConditions.elementSelectionStateToBe(webElement, true));
    }
    public void waitForTitle(int time) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), time);
        wait.until(WebDriver::getTitle);
    }
    public void waitForAlert(WebElement webElement, int time) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), time);
        wait.until(ExpectedConditions.alertIsPresent());
    }
}
