package com.nttdata.stepDefinition;

import com.nttdata.steps.LoginStep;
import com.nttdata.steps.MenuSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class EscenarioThreeStepDef {
    @Steps
    private MenuSteps menuSteps;

    @Steps
    private LoginStep loginStep;


    @Given("me encuentro en la aplicación de SauceLabs")
    public void meEncuentroEnLaAplicaciónDeSauceLabs() {
    }

    @And("voy al menú de Login")
    public void voyAlMenuDeLogin() {
        menuSteps.openSubMenu();
        menuSteps.navigateLogIn();
    }

    @When("ingreso mi usuario {string} y clave {string}")
    public void ingresoMiUsuarioYClave(String usuario, String clave) {
        loginStep.sendUsername(usuario);
        loginStep.sendPassword(clave);
    }

    @And("hago clic en login")
    public void hagoClicEnLogin() {
        loginStep.Ingresar();
    }

    @Then("valido el inicio de sesión")
    public void validoElInicioDeSesión() {
        menuSteps.validateProducts();
    }
}
