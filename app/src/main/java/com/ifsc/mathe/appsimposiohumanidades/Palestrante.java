package com.ifsc.mathe.appsimposiohumanidades;

/**
 * Created by estagiario on 28/07/2017.
 */

public class Palestrante {
    private String nome;
    private String biografia;
    private String link;

    public Palestrante(String nome, String biografia, String link) {
        this.nome = nome;
        this.biografia = biografia;
        this.link = link;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
