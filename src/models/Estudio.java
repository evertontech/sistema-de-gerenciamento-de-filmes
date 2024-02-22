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
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        } else {
            System.out.println("O nome do estudio não pode ser nulo ou vazio");
        }
    }

    public Boolean isIndependente() {
        return this.independente;
    }

    public void setIndependente(Boolean independente) {
        if (independente != null) {
            this.independente = independente;
        } else {
            System.out.println("O atributo de indepedência do estúdio precisa ser um valor válido");
        }
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
        if (avaliacao != null
                && avaliacao.getPontuacao() >= 0.00
                && avaliacao.getPontuacao() <= 5.00) {
            this.avaliacoes.add(avaliacao);
        } else {
            System.out.println("A pontuação da avaliação do estúdio está fora do intervalo.");
        }
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
