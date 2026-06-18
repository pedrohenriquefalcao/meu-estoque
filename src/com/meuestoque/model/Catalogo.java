package com.meuestoque.model;
import java.math.BigDecimal;

public class Catalogo {
    private int idCatalogo;
    private String nomeProduto;
    private String descricao;
    private BigDecimal precoBase;

    public Catalogo() {
    }

    public Catalogo(int idCatalogo, String nomeProduto, String descricao, BigDecimal precoBase) {
        this.idCatalogo = idCatalogo;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.precoBase = precoBase;

    }

    public int getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(int idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(BigDecimal precoBase) {
        this.precoBase = precoBase;
    }
}
