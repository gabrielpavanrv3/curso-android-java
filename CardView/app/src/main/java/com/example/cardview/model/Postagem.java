package com.example.cardview.model;

public class Postagem {
    private String nome;
    private String conteudo;
    private int conteudoFoto;

    public Postagem(String nome, String conteudo, int conteudoFoto) {
        this.nome = nome;
        this.conteudo = conteudo;
        this.conteudoFoto = conteudoFoto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public int getConteudoFoto() {
        return conteudoFoto;
    }

    public void setConteudoFoto(int conteudoFoto) {
        this.conteudoFoto = conteudoFoto;
    }
}
