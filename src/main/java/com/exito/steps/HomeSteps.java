package com.exito.steps;

import com.exito.pageObject.HomePageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.Keys;

public class HomeSteps {

    @Page
    private HomePageObject homePage;


    @Step("El usuario abre la url")
    public void openUrl(){

        homePage.openUrl("https://www.exito.com/");
    }

    @Step("Enviar info de busqueda")
    public void sendInfo(){
        homePage.getDriver().findElement(homePage.getTxtSearch()).sendKeys("Portatil", Keys.ENTER);
    }
}
