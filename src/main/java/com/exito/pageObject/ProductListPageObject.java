package com.exito.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductListPageObject extends PageObject {

    private final By lnkProductsName=By.xpath("//h3/a[@class='link_fs-link__J1sGD']");

    public By getLnkProductsName() {
        return lnkProductsName;
    }
}
