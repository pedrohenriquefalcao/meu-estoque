package com.meuestoque.model;

public class Produto {
    private int idProduto;
    private int idCatalogo;
    private int idSabor;
    private int idLote;
    private double precoVenda;

public Produto() {
}

public Produto (int idProduto, int idCatalogo, int idSabor, int idLote, double precoVenda) {
    this.idProduto = idProduto;
    this.idCatalogo = idCatalogo;
    this.idSabor = idSabor;
    this.idLote = idLote;
    this.precoVenda = precoVenda;
}

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(int idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public int getIdSabor() {
        return idSabor;
    }

    public void setIdSabor(int idSabor) {
        this.idSabor = idSabor;
    }

    public int getIdLote() {
        return idLote;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
}

