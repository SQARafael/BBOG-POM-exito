package com.exito.steps;

import com.exito.models.NameProducModel;
import com.exito.pageObject.ProductListPageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static com.exito.utils.EsperasExplicitas.esperarElemento;
import static com.exito.utils.SeleccionAleatoria.seleccionRandom;

public class ProductListSteps {
    @Page
    private ProductListPageObject listProduct;

    @Step("Seleccion de producto")
    public void selectProduct(){


        List<WebElement> product = listProduct.getDriver().findElements(listProduct.getLnkProductsName());

        WebElement elementoWeb = seleccionRandom(product);
        String nameProduct =String.valueOf(elementoWeb.getText());
        NameProducModel.setNameProduct(nameProduct);

        esperarElemento(listProduct.getDriver(), listProduct.getLnkProductsName());

        elementoWeb.click();
    }
}
