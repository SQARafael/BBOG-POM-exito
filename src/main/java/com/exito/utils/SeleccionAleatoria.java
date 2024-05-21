package com.exito.utils;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class SeleccionAleatoria {

    public static WebElement seleccionRandom(List<WebElement> elementos){
        Random random= new Random();
        int indiceAleatorio = random.nextInt(elementos.size());
        return  elementos.get(indiceAleatorio);
    }
}
