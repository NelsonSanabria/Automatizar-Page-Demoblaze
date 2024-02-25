package com.demoblaze.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    private By btnAcceso = By.xpath("//li[@id='js-acceso']/a");

    public By getBtnAcceso() {
        return btnAcceso;
    }
}
