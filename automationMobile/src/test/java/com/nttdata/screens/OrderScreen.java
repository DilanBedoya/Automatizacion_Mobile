package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class OrderScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Shows current sorting order and displays available sorting options\"]")
    private WebElement btnOrder;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Ascending order by price\"]")
    private WebElement btnAscendant;

    public void clickOrder() {
        btnOrder.click();
    }

    public void clickAscendant() {
        btnAscendant.click();
    }
}
