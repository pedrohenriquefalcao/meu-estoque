package com.meuestoque.model;

public class Catalogo {
    private int idCatalogo;
    private String nomeProduto;
    private String descricao;
    private double precoBase;

    public Catalogo() {
    }

    public Catalogo(int idCatalogo, String nomeProduto, String descricao, double precoBase) {
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

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
}
