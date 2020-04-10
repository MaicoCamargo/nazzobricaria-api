package com.nazzobricaria.model;

import javax.persistence.*;

@Entity
public class TipoPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipoPagamento_ID")
    private int tipoPagamentoID;
    private String tipoPagamento;

    public TipoPagamento() {
    }

    public TipoPagamento(int tipoPagamentoID, String tipoPagamento) {
        this.tipoPagamentoID = tipoPagamentoID;
        this.tipoPagamento = tipoPagamento;
    }

    public int getTipoPagamentoID() {
        return tipoPagamentoID;
    }

    public void setTipoPagamentoID(int tipoPagamentoID) {
        this.tipoPagamentoID = tipoPagamentoID;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "TipoPagamento{" +
                "tipoPagamentoID=" + tipoPagamentoID +
                ", tipoPagamento='" + tipoPagamento + '\'' +
                '}';
    }
}
