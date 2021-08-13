package com.steps;

import org.junit.Assert;

import com.pages.CarrinhoPage;

import io.cucumber.java.pt.Entao;

public class CarrinhoSteps {

    @Entao("^o produto \"(.*)\" deve estar presente no carrinho$")
    public void apresentouProdutoEsperadoNoCarrinho(String nomeProduto) {
        CarrinhoPage carrinhoPage = new CarrinhoPage();
        Assert.assertTrue("Deveria ter apresentado o produto [" + nomeProduto + "] no carrinho",
                carrinhoPage.apresentouProdutoEsperadoNoCarrinho(nomeProduto));
    }

}