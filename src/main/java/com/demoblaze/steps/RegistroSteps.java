package com.demoblaze.steps;


import com.demoblaze.pages.RegistroPage;
import com.demoblaze.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class RegistroSteps {
    @Page
    RegistroPage registro;

    @Step("Ingresar datos de registro")
    public void ingresarDatos(){
        ArrayList<Map<String, String>> datos;

        try {
            datos = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/registro.xlsx", "Registro");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        registro.getDriver().findElement(registro.getTxtEmail())
                .sendKeys(datos.get(0).get("Email"));

        registro.getDriver().findElement(registro.getTxtContraseña())
                .sendKeys(datos.get(0).get("Contraseña"));

    }

    @Step("Ingresar datos de registro")
    public void autorizarYRegistrar(){

        registro.getDriver().findElement(registro.getChkAutorizar())
                .click();

        registro.getDriver().findElement(registro.getBtnRegistrar())
                .submit();
    }
}
