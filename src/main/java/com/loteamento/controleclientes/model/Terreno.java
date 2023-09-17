package com.loteamento.controleclientes.model;

import jakarta.persistence.*;



@Entity
@Table(name = "terreno")
public class Terreno {
    @Id
    @GeneratedValue
    @Column (name = "id_terreno")
    private Long idTerreno;

    @Column(name = "quadra")
    private String quadra;

    @Column(name = "lote")
    private String lote;

    @Column (name = "larg_frente")
    private  float largFrente;

    @Column (name = "larg_fundo")
    private  float largFundo;

    @Column (name = "comp_lado_direito")
    private float comLadoDireito;

    @Column(name = "comp_lado_esquerdo")
    private float compLadoEsquerdo;


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

    public float getLargFrente() {
        return largFrente;
    }

    public void setLargFrente(float largFrente) {
        this.largFrente = largFrente;
    }

    public float getLargFundo() {
        return largFundo;
    }

    public void setLargFundo(float largFundo) {
        this.largFundo = largFundo;
    }

    public float getComLadoDireito() {
        return comLadoDireito;
    }

    public void setComLadoDireito(float comLadoDireito) {
        this.comLadoDireito = comLadoDireito;
    }

    public float getCompLadoEsquerdo() {
        return compLadoEsquerdo;
    }

    public void setCompLadoEsquerdo(float compLadoEsquerdo) {
        this.compLadoEsquerdo = compLadoEsquerdo;
    }

    @Override
    public String toString() {
        return "Terreno{" +
                "idTerreno=" + idTerreno +
                ", quadra='" + quadra + '\'' +
                ", lote='" + lote + '\'' +
                ", largFrente=" + largFrente +
                ", largFundo=" + largFundo +
                ", comLadoDireito=" + comLadoDireito +
                ", compLadoEsquerdo=" + compLadoEsquerdo +
                '}';
    }
}
