package models;

import enums.Genero;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Filme {
    private String titulo;
    private LocalTime tempoDeDuracao;
    private LocalDate dataDeLancamento;
    private Diretor diretor;
    private Genero genero;
    private Estudio estudio;
    private List<Ator> elenco;
    private List<Avaliacao> avaliacoes;

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
        this.titulo = titulo;
    }

    public LocalTime getTempoDeDuracao() {
        return this.tempoDeDuracao;
    }

    public void setTempoDeDuracao(LocalTime tempoDeDuracao) {
        this.tempoDeDuracao = tempoDeDuracao;
    }

    public LocalDate getDataDeLancamento() {
        return this.dataDeLancamento;
    }

    public void setDataDeLancamento(LocalDate dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
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
        this.elenco.add(ator);
    }

    public void exibirInformacoes() {

    }
}
