package models;

public class AtorCoadjuvante extends Pessoa {
    private Double grauDeFama;

    public void setGrauDeFama(Double grauDeFama) {
        this.grauDeFama = grauDeFama;
    }

    public Double getGrauDeFama() {
        return this.grauDeFama;
    }

    public String toString() {
        return "Grau de Fama: " + this.getGrauDeFama();
    }
}
