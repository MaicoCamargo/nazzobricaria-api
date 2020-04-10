package com.nazzobricaria.model;

import javax.persistence.*;

@Entity
public class Permissao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "permissao_ID")
    private int permissaoID;
    private String permissao;

    public Permissao() {
    }

    public Permissao(int permissaoID, String permissao) {
        this.permissaoID = permissaoID;
        this.permissao = permissao;
    }

    public int getPermissaoID() {
        return permissaoID;
    }

    public void setPermissaoID(int permissaoID) {
        this.permissaoID = permissaoID;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

    @Override
    public String toString() {
        return "Permissao{" +
                "permissaoID=" + permissaoID +
                ", permissao='" + permissao + '\'' +
                '}';
    }
}
