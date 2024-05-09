package com.exito.pageObject;
/*
 * @(#) HomePageObject.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */

public class HomePageObject extends PageObject {



    private final By txtSearch= By.xpath("//input[@aria-label='search' and @placeholder='Buscar en exito.com']");

    public By getTxtSearch() {
        return txtSearch;
    }
}
