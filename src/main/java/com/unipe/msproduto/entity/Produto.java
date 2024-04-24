package com.unipe.msproduto.entity;

import com.unipe.msproduto.dto.ProdutoDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int quantidade;
    private String descricao;
    private BigDecimal preco;

    public Produto(String nome, int quantidade, String descricao, BigDecimal preco) {
        super();
        this.nome = nome;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.preco = preco;
    }

    public static Produto fromDTO(ProdutoDTO dto) {
        return new Produto(dto.nome(), dto.quantidade(), dto.descricao(), dto.preco());
    }
}
