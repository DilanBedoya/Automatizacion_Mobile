package com.nttdata.stepDefinition;

import com.nttdata.steps.MenuSteps;
import com.nttdata.steps.OrderStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;

public class EscenarioTwoStepDef {

    @Steps
    private OrderStep orderStep;

    @Steps
    private MenuSteps menuSteps;

    @Given("me ubico en la aplicación de SauceLabs")
    public void meUbicoEnLaAplicaciónDeSauceLabs() {
    }

    @And("ingreso al menu de ordenamiento")
    public void ingresoAlMenuDeOrdenamiento() {
        orderStep.selectOptionOrder();
    }

    @And("ordeno de forma ascendente")
    public void ordenoDeFormaAecendente() {
        orderStep.selectOrder();
    }

    @Then("valido que carguen correctamente los productos")
    public void validoQueCarguenCorrectamenteLosProductos() {
        menuSteps.validateProducts();
    }
}
