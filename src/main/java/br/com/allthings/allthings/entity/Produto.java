package br.com.allthings.allthings.entity;

import jakarta.persistence.Entity;

@Entity
public class Produto {
    
    private Integer idProduto;

    private String descricaoProduto;

    private String marcaProduto;

    private String modeloProduto;

    private String unidadeProduto;
    
    private double valorProduto;
}
