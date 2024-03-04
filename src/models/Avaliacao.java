package models;

public class Avaliacao {
    private Critico critico;
    private Double pontuacao;

    public void setCritico(Critico critico) {
        this.critico = critico;
    }

    public Critico getCritico() {
        return this.critico;
    }

    public void setPontuacao(Double pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Double getPontuacao() {
        return this.pontuacao;
    }

    public String toString() {
        return "Crítico: " + this.critico + "Pontuação: " + this.pontuacao;
    }
}
