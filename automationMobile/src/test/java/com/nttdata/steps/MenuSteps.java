package com.nttdata.steps;

import com.nttdata.screens.MenuScreen;
import org.junit.Assert;

public class MenuSteps {
    MenuScreen menuScreen;

    public void validateProducts(){
        Assert.assertTrue("La lista de productos debería contener elementos", menuScreen.List() > 0);
        try {
            Thread.sleep(2000); // Espera de 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void openSubMenu(){
        menuScreen.SubMenu();
    }

    public void navigateLogIn(){
        menuScreen.ClickLogIn();
    }


}
