package com.nazzobricaria.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Permissao {
    /*link @JoinTable: http://fruzenshtein.com/hibernate-join-table-intermediary/*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "permissao_ID")
    private int permissaoID;
    private String permissao;

    public Permissao() {
    }

    public Permissao(String permissao) {
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
