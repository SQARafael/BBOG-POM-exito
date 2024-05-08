package com.exito.steps;

import com.exito.pageObject.HomePageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class HomeSteps {

    @Page
    private HomePageObject homePage;

    @Step("El usuario abre la url")
    public void openUrl(){
        homePage.openUrl("https://www.exito.com/");
    }
}
