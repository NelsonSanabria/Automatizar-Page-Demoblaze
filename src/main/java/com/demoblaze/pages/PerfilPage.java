package com.demoblaze.pages;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PerfilPage extends PageObject {

    private By lblAcceso = By.xpath("//div[contains(@class,'module-title')]");

    public By getLblAcceso() {
        return lblAcceso;
    }
}
