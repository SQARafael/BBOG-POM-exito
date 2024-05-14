package com.exito.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PayProductPage extends PageObject {
    private final By lnkNameProduct= By.xpath("//div[@data-molecule-product-detail-name]/span");

    public By getLnkNameProduct() {
        return lnkNameProduct;
    }
}
