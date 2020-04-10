package com.nazzobricaria.model;

import javax.persistence.*;

@Entity
public class UsuarioPermissao {

    @Id
    @Column(name = "usuarioPermissao_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int usuarioPermissaoID;
    @ManyToOne()
    private Usuario usuario;
    @ManyToOne
    private Permissao permissao;

    public UsuarioPermissao() {
    }

    public int getUsuarioPermissaoID() {
        return usuarioPermissaoID;
    }

    public void setUsuarioPermissaoID(int usuarioPermissaoID) {
        this.usuarioPermissaoID = usuarioPermissaoID;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Permissao getPermissao() {
        return permissao;
    }

    public void setPermissao(Permissao permissao) {
        this.permissao = permissao;
    }

    @Override
    public String toString() {
        return "UsuarioPermissao{" +
                "usuarioPermissaoID=" + usuarioPermissaoID +
                ", usuario=" + usuario +
                ", permissao=" + permissao +
                '}';
    }
}
