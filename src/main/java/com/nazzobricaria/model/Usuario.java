package com.nazzobricaria.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_ID")
    private int usuarioID;
    private String nome;
    private String sobrenome;
    private String email;
    private String cpf;
    @ManyToOne
    private Endereco endereco;
    private Date criadoEm;
    private Date editadoEm;
    private Date ultimoAcesso;

    public Usuario() {
    }

    public int getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(int usuarioID) {
        this.usuarioID = usuarioID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Date getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(Date criadoEm) {
        this.criadoEm = criadoEm;
    }

    public Date getEditadoEm() {
        return editadoEm;
    }

    public void setEditadoEm(Date editadoEm) {
        this.editadoEm = editadoEm;
    }

    public Date getUltimoAcesso() {
        return ultimoAcesso;
    }

    public void setUltimoAcesso(Date ultimoAcesso) {
        this.ultimoAcesso = ultimoAcesso;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuarioID=" + usuarioID +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco=" + endereco +
                ", criadoEm=" + criadoEm +
                ", editadoEm=" + editadoEm +
                ", ultimoAcesso=" + ultimoAcesso +
                '}';
    }
}

