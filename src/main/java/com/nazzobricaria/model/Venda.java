package com.nazzobricaria.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "venda_ID")
    private int vendaID;
    @ManyToOne
    private Produto produto;
    @ManyToOne
    private Usuario comprador;
    @ManyToOne
    private Usuario vendedor;
    private Date date;
    private float valor;
    @ManyToOne
    private TipoPagamento tipoPagamento;

    public Venda() {
    }

    public int getVendaID() {
        return vendaID;
    }

    public void setVendaID(int vendaID) {
        this.vendaID = vendaID;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Usuario getComprador() {
        return comprador;
    }

    public void setComprador(Usuario comprador) {
        this.comprador = comprador;
    }

    public Usuario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Usuario vendedor) {
        this.vendedor = vendedor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "vendaID=" + vendaID +
                ", produto=" + produto +
                ", comprador=" + comprador +
                ", vendedor=" + vendedor +
                ", date=" + date +
                ", valor=" + valor +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
