package com.exito.steps;

import com.exito.models.NameProducModel;
import com.exito.pageObject.ProductListPageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductListSteps {
    @Page
    private ProductListPageObject listProduct;

    @Step("Seleccion de producto")
    public void selectProduct(){
        NameProducModel nameProducModel=new NameProducModel();

        List<WebElement> product = listProduct.getDriver().findElements(listProduct.getLnkProductsName());

        String nameProduct = product.get(0).getText();
        nameProducModel.setNameProduct(nameProduct);
        product.get(0).click();
    }
}
