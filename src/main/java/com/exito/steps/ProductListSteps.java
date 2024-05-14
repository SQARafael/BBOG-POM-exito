package com.exito.steps;

import com.exito.models.NameProducModel;
import com.exito.pageObject.ProductListPageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.exito.utils.EsperasExplicitas.esperarElemento;

public class ProductListSteps {
    @Page
    private ProductListPageObject listProduct;

    @Step("Seleccion de producto")
    public void selectProduct(){


        List<WebElement> product = listProduct.getDriver().findElements(listProduct.getLnkProductsName());

        String nameProduct =String.valueOf(product.get(0).getText());
        NameProducModel.setNameProduct(nameProduct);
        System.out.println(NameProducModel.getNameProduct() + "Producto seleccionado");
        esperarElemento(listProduct.getDriver(), listProduct.getLnkProductsName());

        product.get(0).click();
    }
}
