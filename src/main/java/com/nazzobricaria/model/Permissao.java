package com.nazzobricaria.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.ManyToAny;

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

    @JsonIgnore
    @ManyToMany()
    @JoinTable(name = "usuario_permissao",
            joinColumns = {@JoinColumn(name = "idPermissao",referencedColumnName = "permissao_ID")},
            inverseJoinColumns = {@JoinColumn(name = "idUsuario", referencedColumnName = "usuario_ID")})
    private List<Usuario> usuarios;

    public Permissao() {
    }

    public Permissao(int permissaoID, String permissao, List<Usuario> usuarios) {
        this.permissaoID = permissaoID;
        this.permissao = permissao;
        this.usuarios = usuarios;
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

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    /*@Override
    public String toString() {
        return "Permissao{" +
                "permissaoID=" + permissaoID +
                ", permissao='" + permissao + '\'' +
                ", usuarios=" + usuarios +
                '}';
    }*/
}
