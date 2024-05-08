package com.exito.stepDefinitions;
/*
 * @(#) AddProductStepDefinitions.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.exito.steps.HomeSteps;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Steps;


/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class AddProductStepDefinitions {
    @Steps
    private HomeSteps homeSteps;


    @Given("que el usuario ingresa a la pagina web")
    public void queElUsuarioIngresaALaPaginaWeb() {
        homeSteps.openUrl();

    }
    @When("el usuario ingresa al menu")
    public void elUsuarioIngresaAlMenu() {

    }
    @When("Busca la categoria y subcategoria")
    public void buscaLaCategoriaYSubcategoria() {

    }
    @When("Selecciona el producto")
    public void seleccionaElProducto() {

    }
    @When("Dar click en el boton de agregar al carrito")
    public void darClickEnElBotonDeAgregarAlCarrito() {

    }
    @Then("Se podra visualizar el producto en el carrito de compras")
    public void sePodraVisualizarElProductoEnElCarritoDeCompras() {

    }
}
