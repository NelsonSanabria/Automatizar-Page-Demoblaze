package com.demoblaze.steps;


import com.demoblaze.pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;


public class HomeSteps {
    @Page
    HomePage homePage;


    @Step("Abrir el navegador")
    public void abrirNavegador(){
                homePage.openUrl("https://www.demoblaze.com/");
    }

    @Step("Dar clic en boton Acceso")
    public void darClicAcceso(){
        homePage.getDriver().findElement(homePage.getBtnAcceso()).click();
    }


}
