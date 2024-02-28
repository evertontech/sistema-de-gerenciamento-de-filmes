package models;

import enums.Classificacao;
import enums.Genero;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class Filme implements Avaliavel {
    private String titulo;
    private Duration tempoDeDuracao;
    private LocalDateTime dataHorarioDeLancamento;
    private Diretor diretor;
    private Genero genero;
    private Estudio estudio;
    private List<Ator> elenco;
    private List<Avaliacao> avaliacoes;

    public Filme(Diretor diretor, AtorPrincipal atorPrincipal) {
        if (diretor != null && atorPrincipal != null) {
            this.setDiretor(diretor);
            this.adicionarAtor(atorPrincipal);
        } else {
            System.out.println("O filme deve ter um diretor e um ator principal.");
        }
    }

    private void setElenco(List<Ator> elenco) {
        this.elenco = elenco;
    }

    private void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isBlank()) {
            this.titulo = titulo;
        } else {
            System.out.println("O titulo do filme nao pode ser branco");
        }
    }

    public Duration getTempoDeDuracao() {
        return this.tempoDeDuracao;
    }

    public void setTempoDeDuracao(Duration tempoDeDuracao) {
        if (tempoDeDuracao.isPositive()) {
            this.tempoDeDuracao = tempoDeDuracao;
        } else {
            System.out.println("O tempo de duração não pode ser menor que zero");
        }
    }

    public LocalDateTime getDataHorarioDeLancamento() {
        return this.dataHorarioDeLancamento;
    }

    public void setDataHorarioDeLancamento(LocalDateTime dataHorarioDeLancamento) {
        LocalDateTime dataHorarioAtual = LocalDateTime.now();
        if (dataHorarioDeLancamento != null && dataHorarioDeLancamento.isBefore(dataHorarioAtual)) {
            this.dataHorarioDeLancamento = dataHorarioDeLancamento;
        } else {
            System.out.println("A data de lançamento não pode ser depois da data atual.");
        }
    }

    public Diretor getDiretor() {
        return this.diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public Genero getGenero() {
        return this.genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Estudio getEstudio() {
        return this.estudio;
    }

    public void setEstudio(Estudio estudio) {
        this.estudio = estudio;
    }

    public List<Ator> getElenco() {
        return this.elenco;
    }

    public List<Avaliacao> getAvaliacoes() {
        return this.avaliacoes;
    }

    public void adicionarAtor(Ator ator) {
        boolean nomeJaExiste = false;

        for (Ator atorDaLista : elenco) {
            if (atorDaLista.getNome().equals(ator.getNome())) {
                nomeJaExiste = true;
                break;
            }
        }

        if (nomeJaExiste) {
            System.out.println("O nome do ator não pode ser igual");
        } else {
            this.elenco.add(ator);
        }
    }

    @Override
    public void adicionarAvaliacao(Avaliacao avaliacao) {
        if (avaliacao != null
                && avaliacao.getPontuacao() >= 0.0
                && avaliacao.getPontuacao() <= 10.0) {
            this.avaliacoes.add(avaliacao);
        } else {
            System.out.println("A pontuação está fora do intervalo");
        }
    }

    @Override
    public void limparAvaliacoes() {
        this.avaliacoes.clear();
    }

    @Override
    public Double calcularMediaAvaliacoes() {
        Double somaPontuacao = 0.0;
        int comprimento = 0;

        for (Avaliacao avaliacao : this.getAvaliacoes()) {
            somaPontuacao += avaliacao.getPontuacao();
            comprimento = avaliacoes.size();
        }

        return somaPontuacao / comprimento;
    }

    public Classificacao calcularClassificacao() {
        int menorIdadeDosAtores = 0;

        for (Ator ator : elenco) {
            if (ator.getIdade() < menorIdadeDosAtores) {
                menorIdadeDosAtores = ator.getIdade();
            }
        }

        int idadeDeClassificacao = menorIdadeDosAtores + 5;

        if (idadeDeClassificacao < 10) {
            return Classificacao.LIVRE;
        } else if (idadeDeClassificacao < 12) {
            return Classificacao.MAIOR_10;
        } else if (idadeDeClassificacao < 14) {
            return Classificacao.MAIOR_12;
        } else if (idadeDeClassificacao < 16) {
            return Classificacao.MAIOR_14;
        } else if (idadeDeClassificacao < 18) {
            return Classificacao.MAIOR_16;
        } else {
            return Classificacao.MAIOR_18;
        }
    }

    public void exibirAvaliacoes() {
        for (Avaliacao avaliacao : avaliacoes) {
            System.out.println(avaliacao.getCritico());
            System.out.println("Pontuação atribuída: " + avaliacao.getPontuacao());
        }
    }

    public void exibirInformacoes() {

    }

    public void exibirClassificacao() {
        System.out.println("A classificação indicativa desse filme é: " + this.calcularClassificacao());
    }

    public void exibirMediaDasAvaliacoes() {
        System.out.printf("A média das avaliações é: %.2f\n", this.calcularMediaAvaliacoes());
    }
}
