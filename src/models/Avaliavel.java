package models;

public interface Avaliavel {
    void adicionarAvaliacao(Avaliacao avaliacao);

    void limparAvaliacoes();

    Double calcularMediaAvaliacoes();
}
