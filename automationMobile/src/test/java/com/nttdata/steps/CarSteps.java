package com.nttdata.steps;

import com.nttdata.screens.CarScreen;
import org.junit.Assert;

public class CarSteps {
    CarScreen carScreen;

    public void validateTitle() {
        // Obtener el nombre actual del producto
        String actualName = carScreen.getName();
        String expectedName1 = "Sauce Labs Bolt T-Shirt";
        String expectedName2 = "Sauce Labs Backpack";
        String expectedName3 = "Sauce Labs Bike Light";

        // Verificar si el nombre actual es uno de los valores esperados
        boolean isValid = actualName.equals(expectedName1) || actualName.equals(expectedName2) || actualName.equals(expectedName3);

        // Validar que el nombre del producto sea uno de los esperados
        Assert.assertTrue("El nombre del producto no es uno de los valores esperados.", isValid);
    }



}
