package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuScreen extends PageObject {


    //Lista de productos
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Container for fragments\"]/android.view.ViewGroup")
    private List<WebElement> ProductsList;

    //Desplegar submenus
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"View menu\"]")
    private WebElement btnSubMenu;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/itemTV\" and @text=\"Log In\"]")
    private WebElement btnLogIn;

    public int List() {
        return ProductsList.size();
    }

    public void SubMenu(){
        btnSubMenu.click();
    }

    public void ClickLogIn(){
        btnLogIn.click();
    }

}
