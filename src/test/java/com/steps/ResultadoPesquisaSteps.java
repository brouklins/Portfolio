package com.steps;

import com.pages.ResultadoPesquisaPage;

import io.cucumber.java.pt.Quando;

public class ResultadoPesquisaSteps {

    @Quando("^adiciona o produto \"(.*)\" ao carrinho$")
    public void adicionarProdutoAoCarrinho(String nomeProduto) {
        ResultadoPesquisaPage resultadoPesquisaPage = new ResultadoPesquisaPage();
        resultadoPesquisaPage.adicionarProdutoAoCarrinho(nomeProduto);
    }

}