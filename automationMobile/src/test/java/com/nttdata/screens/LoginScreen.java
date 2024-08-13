package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/nameET\"]")
    private WebElement txtUsername;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/passwordET\"]")
    private WebElement txtPassword;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to login with given credentials\"]")
    private WebElement btnLogin;


    public void writeUser(String user) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(txtUsername));
        waitFor(ExpectedConditions.elementToBeClickable(txtUsername));
        txtUsername.sendKeys(user);
    }

    public void writePassword(String password) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(txtPassword));
        waitFor(ExpectedConditions.elementToBeClickable(txtPassword));
        txtPassword.sendKeys(password);
    }

    public void clickLogin() {
        btnLogin.click();
    }


}
