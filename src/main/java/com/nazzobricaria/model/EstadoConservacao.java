package com.nazzobricaria.model;

import javax.persistence.*;

@Entity
public class EstadoConservacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estadoConservacao_ID")
    private int estadoConservacaoID;
    private String estadoConservacao;

    public EstadoConservacao(int estadoConservacaoID, String estadoConservacao) {
        this.estadoConservacaoID = estadoConservacaoID;
        this.estadoConservacao = estadoConservacao;
    }

    public EstadoConservacao() {
    }

    public int getEstadoConservacaoID() {
        return estadoConservacaoID;
    }

    public void setEstadoConservacaoID(int estadoConservacaoID) {
        this.estadoConservacaoID = estadoConservacaoID;
    }

    public String getEstadoConservacao() {
        return estadoConservacao;
    }

    public void setEstadoConservacao(String estadoConservacao) {
        this.estadoConservacao = estadoConservacao;
    }

    @Override
    public String toString() {
        return "EstadoConservacao{" +
                "estadoConservacaoID=" + estadoConservacaoID +
                ", estadoConservacao='" + estadoConservacao + '\'' +
                '}';
    }
}
