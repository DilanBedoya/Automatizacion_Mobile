package com.nttdata.steps;

import com.nttdata.screens.OrderScreen;

public class OrderStep {
    OrderScreen orderScreen;

    public void selectOptionOrder(){
        orderScreen.clickOrder();
        try {
            Thread.sleep(2000); // Espera de 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selectOrder(){
        orderScreen.clickAscendant();
        try {
            Thread.sleep(2000); // Espera de 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
