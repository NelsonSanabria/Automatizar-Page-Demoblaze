package com.demoblaze.runners.stepDefinitions;


import com.demoblaze.steps.CorreoSteps;
import com.demoblaze.steps.HomeSteps;
import com.demoblaze.steps.PerfilSteps;
import com.demoblaze.steps.RegistroSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;


public class RegistroStepDefinitions {

    @Steps
    HomeSteps homeSteps;

    @Steps
    CorreoSteps email;

    @Steps
    RegistroSteps registro;
    @Steps
    PerfilSteps perfil;

    @Dado("que el usuario abre la pagina Demoblaze")
    public void queElUsuarioAbreLaPaginaDemoblaze() {
        homeSteps.abrirNavegador();

    }
    @Dado("pulsar el boton Acceso")
    public void pulsarElBotonAcceso() {
        homeSteps.darClicAcceso();

    }
    @Cuando("el usuario ingresa la informacion de registro")
    public void elUsuarioIngresaLaInformacionDeRegistro(DataTable dataTable) {
        email.ingresarCorreo();
        email.clicValidarEmail();
        registro.ingresarDatos();
        registro.autorizarYRegistrar();

    }
    @Entonces("verá el panel de Acceso")
    public void veraElPanelDeAcceso() {
        perfil.validarRegistro();

    }
}
