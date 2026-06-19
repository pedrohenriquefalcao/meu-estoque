package com.meuestoque.model;

import java.math.BigDecimal;

public class Produto {
    private int idProduto;
    private Catalogo idCatalogo;
    private Sabor idSabor;
    private Lote idLote;
    private BigDecimal precoVenda;

    public Produto() {
    }

    public Produto(int idProduto, Catalogo idCatalogo, Sabor idSabor, Lote idLote, BigDecimal precoVenda) {
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

    public Catalogo getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(Catalogo idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public Sabor getIdSabor() {
        return idSabor;
    }

    public void setIdSabor(Sabor idSabor) {
        this.idSabor = idSabor;
    }

    public Lote getIdLote() {
        return idLote;
    }

    public void setIdLote(Lote idLote) {
        this.idLote = idLote;
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }
}

