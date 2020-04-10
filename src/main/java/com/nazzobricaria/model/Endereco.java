package com.nazzobricaria.model;

import javax.persistence.*;

@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "endereco_ID")
    private int enderecoID;
    private String rua;
    private String complemento;
    private String CEP;
    private String cidade;
    private int numero;
    private float latitude;
    private float longetude;

    public Endereco() {
    }

    public int getEnderecoID() {
        return enderecoID;
    }

    public void setEnderecoID(int enderecoID) {
        this.enderecoID = enderecoID;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongetude() {
        return longetude;
    }

    public void setLongetude(float longetude) {
        this.longetude = longetude;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "enderecoID=" + enderecoID +
                ", rua='" + rua + '\'' +
                ", complemento='" + complemento + '\'' +
                ", CEP='" + CEP + '\'' +
                ", cidade='" + cidade + '\'' +
                ", numero=" + numero +
                ", latitude=" + latitude +
                ", longetude=" + longetude +
                '}';
    }
}
