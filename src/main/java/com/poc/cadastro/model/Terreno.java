package com.poc.cadastro.model;

import jakarta.persistence.*;



@Entity
@Table(name = "terreno")

public class Terreno {
    @Id
    @GeneratedValue
    @Column (name = "idTerreno")
    private Long idTerreno;

    @Column(name = "quadra")
    private String quadra;

    @Column(name = "lote")
    private String lote;

    @Column (name = "largFrente")
    private  int largFrente;

    @Column (name = "largFundo")
    private  int largFundo;

    @Column (name = "compLadoDireito")
    private int comLadoDireito;

    @Column(name = "compLadoEsquerdo")
    private int compLadoEsquerdo;

    @Column(name = "nomeRuaLimiteTerreno")
    private String nomeRuaLimite;

    @Column(name = "numeroRuaLimiteTerreno")
    private String numeroRuaLimite;

    @Column(name = "numeroLoteFundos")
    private String numeroLoteFundos;

    @Column(name = "numeroLoteDireita")
    private String numeroLoteDireita;

    @Column(name = "numeroLoteEsquerda")
    private String numeroLoteEsquerda;


    public Long getIdTerreno() {
        return idTerreno;
    }

    public void setIdTerreno(Long idTerreno) {
        this.idTerreno = idTerreno;
    }

    public String getQuadra() {
        return quadra;
    }

    public void setQuadra(String quadra) {
        this.quadra = quadra;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public int getLargFrente() {
        return largFrente;
    }

    public void setLargFrente(int largFrente) {
        this.largFrente = largFrente;
    }

    public int getLargFundo() {
        return largFundo;
    }

    public void setLargFundo(int largFundo) {
        this.largFundo = largFundo;
    }

    public int getComLadoDireito() {
        return comLadoDireito;
    }

    public void setComLadoDireito(int comLadoDireito) {
        this.comLadoDireito = comLadoDireito;
    }

    public int getCompLadoEsquerdo() {
        return compLadoEsquerdo;
    }

    public void setCompLadoEsquerdo(int compLadoEsquerdo) {
        this.compLadoEsquerdo = compLadoEsquerdo;
    }

    public String getNomeRuaLimite() {
        return nomeRuaLimite;
    }

    public void setNomeRuaLimite(String nomeRuaLimite) {
        this.nomeRuaLimite = nomeRuaLimite;
    }

    public String getNumeroRuaLimite() {
        return numeroRuaLimite;
    }

    public void setNumeroRuaLimite(String numeroRuaLimite) {
        this.numeroRuaLimite = numeroRuaLimite;
    }

    public String getNumeroLoteFundos() {
        return numeroLoteFundos;
    }

    public void setNumeroLoteFundos(String numeroLoteFundos) {
        this.numeroLoteFundos = numeroLoteFundos;
    }

    public String getNumeroLoteDireita() {
        return numeroLoteDireita;
    }

    public void setNumeroLoteDireita(String numeroLoteDireita) {
        this.numeroLoteDireita = numeroLoteDireita;
    }

    public String getNumeroLoteEsquerda() {
        return numeroLoteEsquerda;
    }

    public void setNumeroLoteEsquerda(String numeroLoteEsquerda) {
        this.numeroLoteEsquerda = numeroLoteEsquerda;
    }

    @Override
    public String toString() {
        return "Terreno{" +
                "Id do Terreno: " + idTerreno +
                "Quadra: " + quadra +
                "Lote: : " + lote +
                "Largura de Frente: " + largFrente +
                "Largura de Fundo: =" + largFundo +
                "Comprimento do Lado Direito: " + comLadoDireito +
                "Comprimento do Lado Esquerdo: " + compLadoEsquerdo +
                "Nome da Rua Limite" + nomeRuaLimite +
                "Nome da Rua que Limita-se o Terreno" + nomeRuaLimite +
                "Número do Lote Fundos" + numeroLoteFundos +
                "Número do Lote Lado Direito: " + numeroLoteDireita +
                "Número do Lote Lado Esquerdo" + numeroLoteEsquerda +

                '}';

    }



}
