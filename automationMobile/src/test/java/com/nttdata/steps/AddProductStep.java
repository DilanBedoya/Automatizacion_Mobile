package com.nttdata.steps;

import com.nttdata.screens.AddProductScreen;


public class AddProductStep {

    AddProductScreen addProductScreen;

    public void selectProduct(String productName) {
        if (productName.equals("Sauce Labs Backpack")) {
            addProductScreen.selectBackpage();
        } else if (productName.equals("Sauce Labs Bolt T-Shirt")) {
            addProductScreen.selectTshirt();
        } else if (productName.equals("Sauce Labs Bike Light")) {
            //ERROR EN EL APK, NO SIGUE AL MENU DEL CARRITO
            addProductScreen.selectBike();
            throw new IllegalStateException("Error conocido: El producto 'Sauce Labs Bike Light' no puede ser seleccionado debido a un problema en el APK.");
        } else {
            throw new IllegalArgumentException("Error al encontrar el producto: " + productName);
        }

    }

    public void clics(int quantity){
        for (int i = 0; i < quantity-1; i++) {
            addProductScreen.addClic();
        }
    }

    public void addToCar(){
        addProductScreen.addToCar();
    }

    public void selectCar(){
        addProductScreen.selectBtnCar();
    }
}
