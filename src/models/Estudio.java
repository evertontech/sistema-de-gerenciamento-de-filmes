package models;

import java.util.List;

public class Estudio {
    private String nome;
    private Boolean independente;
    private List<Avaliacao> avaliacoes;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean isIndependente() {
        return this.independente;
    }

    public void setIndependente(Boolean independente) {
        this.independente = independente;
    }

    public List<Avaliacao> getAvaliacoes() {
        return this.avaliacoes;
    }

    private void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public String toString() {
        return this.getNome() + this.getAvaliacoes();
    }
}
