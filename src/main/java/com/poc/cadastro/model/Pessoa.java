package com.poc.cadastro.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long idPessoa;
    @Column(name = "nome")
    private String nome;
    @Column(name = "idade")
    private int idade;

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "idPessoa=" + idPessoa +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
