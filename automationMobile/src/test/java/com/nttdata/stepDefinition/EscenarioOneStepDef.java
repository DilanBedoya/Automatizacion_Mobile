package com.nttdata.stepDefinition;

import com.nttdata.steps.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class EscenarioOneStepDef {

    @Steps
    private MenuSteps menuSteps;

    @Steps
    private AddProductStep addProductStep;

    @Steps
    private CarSteps carSteps;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {
    }

    @And("valido que carguen correctamente los productos en la galería")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGalería() {
        menuSteps.validateProducts();

    }

    @When("agrego {int} del siguiente producto {string}")
    public void agregoUnidadesDelSiguienteProducto(int unidades, String producto) {
        addProductStep.selectProduct(producto);
        addProductStep.clics(unidades);
        addProductStep.addToCar();
        addProductStep.selectCar();

    }

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {

        carSteps.validateTitle();
    }
}
