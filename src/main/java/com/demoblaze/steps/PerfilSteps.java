package com.demoblaze.steps;


import com.demoblaze.pages.PerfilPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class PerfilSteps {

    @Page
    PerfilPage perfil;

    @Step("Validar registro")
    public void validarRegistro(){
        Assert.assertTrue(
                perfil.getDriver().findElement(perfil.getLblAcceso()).isDisplayed()
        );
    }
}
