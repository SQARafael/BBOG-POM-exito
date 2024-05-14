package com.exito.steps;

import com.exito.models.NameProducModel;
import com.exito.pageObject.PayProductPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PayProductSteps {
    @Page
    private PayProductPage payProduct;

    @Step("Assertions")
    public void validarProducto(){



        //assertTrue(
        //       payProduct.getDriver().findElement(payProduct.getLnkNameProduct()).isDisplayed()
        //);

        assertEquals(
                NameProducModel.getNameProduct(),
                String.valueOf(payProduct.getDriver().findElement(payProduct.getLnkNameProduct()).getText())
        );


    }
}
