package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddProductScreen extends PageObject {

    //añadir cantidad de productos
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement btnQuantity;

    //Seleccionar productos
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement btnBackpage;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement btnTshirt;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bike Light\"]")
    private WebElement btnBike;

    //boton de agregar y navegar al carrito

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnAddToCar;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    private WebElement btnCar;

    //métodos necesarios
    public void addClic(){
    btnQuantity.click();
    }

    public void selectBackpage(){
        btnBackpage.click();
    }
    public void selectTshirt(){
        btnTshirt.click();
    }
    public void selectBike(){
        btnBike.click();
    }

    public void addToCar(){
        btnAddToCar.click();
    }
    public void selectBtnCar(){
        btnCar.click();
    }
}
