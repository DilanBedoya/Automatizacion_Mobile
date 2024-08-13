package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class CarScreen extends PageObject {
    //validar que carrito de compras actualice correctamente basandonos en el nombre del producto
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\"]")
    private WebElement productName;


    public String getName() {
        return productName.getText();
    }


}
