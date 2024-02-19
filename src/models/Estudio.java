package models;

import java.util.List;

public class Estudio implements Avaliavel {
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

    @Override
    public void adicionarAvaliacao(Avaliacao avaliacao) {
        this.avaliacoes.add(avaliacao);
    }

    @Override
    public void limparAvaliacoes() {
        this.avaliacoes.clear();
    }

    @Override
    public Double calcularMediaAvaliacoes() {
        Double soma = 0.0;

        for (Avaliacao avaliacao : getAvaliacoes()) {
            soma += avaliacao.getPontuacao();
        }

        return soma / avaliacoes.size();
    }
}
