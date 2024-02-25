package com.demoblaze.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class ValidacionCorreo extends PageObject {

    private final By txtEmail= By.id("js-login-email");
    private final By btnContinuar = By.id("js-login-continue");

    public By getTxtEmail() {
        return txtEmail;
    }

    public By getBtnContinuar() {
        return btnContinuar;
    }
}
