package com.demoblaze.pages;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegistroPage extends PageObject {
    private By txtEmail = By.id("register.email");
    private final By txtContraseña = By.id("register.contraseña");

    private By chkAutorizar = By.xpath("//*[@id='almacenarRegisterForm']/div/label[@for='registerChkTermsConditions']");
    private By btnRegistrar = By.xpath("//*[@id='almacenarRegisterForm']/div/button");

    public By getTxtEmail() {
        return txtEmail;
    }

    public By getTxtContraseña() {
        return txtContraseña;
    }

    public By getChkAutorizar() {
        return chkAutorizar;
    }

    public By getBtnRegistrar() {
        return btnRegistrar;
    }
}
