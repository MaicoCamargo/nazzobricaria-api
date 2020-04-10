package com.nazzobricaria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "PRODUTO_1")
public class Produto {

    @GeneratedValue
    @Id
    private int produtoID;
    private String nome;
    private String descricao;
    private float valor;
    private int idUsuario;
    private int idEstadoConservacao;
    private int idStatus;
    private Date createdAt;
    private Date updatedAt;

    public Produto() {
    }

    @Override
    public String toString() {
        return "Produto{" +
                "produtoID=" + produtoID +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", idUsuario=" + idUsuario +
                ", idEstadoConservacao=" + idEstadoConservacao +
                ", idStatus=" + idStatus +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}

