package com.nazzobricaria.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
public class Usuario {
    /*link @JoinTable: http://fruzenshtein.com/hibernate-join-table-intermediary/*/
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
    private Date ultimoAcesso;
    private String password;
    private Date criadoEm;
    private Date editadoEm;
    private boolean ativo;

    @ManyToMany
    @JoinTable(name = "usuario_permissao",
            joinColumns = {@JoinColumn(name = "idUsuario", referencedColumnName = "usuario_ID")},
            inverseJoinColumns = {@JoinColumn(name = "idPermissao", referencedColumnName = "permissao_ID")})
    private Collection<Permissao> permissoes;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Collection<Permissao> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(Collection<Permissao> permissoes) {
        this.permissoes = permissoes;
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
                ", ultimoAcesso=" + ultimoAcesso +
                ", password='" + password + '\'' +
                ", criadoEm=" + criadoEm +
                ", editadoEm=" + editadoEm +
                ", ativo=" + ativo +
                ", permissoes=" + permissoes +
                '}';
    }
}

