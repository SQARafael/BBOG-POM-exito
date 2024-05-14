package com.exito.steps;

import com.exito.pageObject.ProductDetailsPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static com.exito.utils.EsperasExplicitas.esperarElemento;

public class ProductDetailsSteps {
    @Page
    private ProductDetailsPage productDetails;

    @Step("Click en el boton agregar al carrito")
    public void clickAddToCar(){
        esperarElemento(productDetails.getDriver(), productDetails.getBtnAddToCar());
        productDetails.getDriver().findElement(productDetails.getBtnAddToCar()).click();
    }

    @Step("Click en el carrito")
    public void clickToCar(){
        productDetails.getDriver().findElement(productDetails.getBtnCar()).click();
    }
}
