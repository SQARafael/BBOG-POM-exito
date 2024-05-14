package com.exito.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductDetailsPage extends PageObject {
    private final By btnAddToCar= By.xpath("//*[@id=\"__next\"]/main/section[1]/section[1]/section[2]/section/section[1]/div[1]/button");

    private final By btnCar= By.xpath("//button/span[@data-fs-cart-title]");

    public By getBtnCar() {
        return btnCar;
    }

    public By getBtnAddToCar() {
        return btnAddToCar;
    }
}
