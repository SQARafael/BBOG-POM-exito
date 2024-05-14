package com.exito.models;

public class NameProducModel {
      private static String nameProduct;

    public static String getNameProduct() {
        return nameProduct;
    }

    public static void setNameProduct(String nameProduct) {
        NameProducModel.nameProduct = nameProduct;
    }
}
