package com.unipe.msproduto.dto;

import com.unipe.msproduto.entity.Produto;

import java.math.BigDecimal;

public record ProdutoDTO(Long id, String nome, int quantidade, String descricao, BigDecimal preco) {
    public ProdutoDTO(Produto produto) {
        this(produto.getId(), produto.getNome(), produto.getQuantidade(), produto.getDescricao(), produto.getPreco());
    }
}
