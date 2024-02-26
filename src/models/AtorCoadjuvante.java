package models;

public class AtorCoadjuvante extends Ator {
    private Double grauDeFama;

    public void setGrauDeFama(Double grauDeFama) {
        if (grauDeFama >= 0.0 && grauDeFama <= 10.0) {
            this.grauDeFama = grauDeFama;
        } else {
            System.out.println("O grau de fama deve estar dentro do intervalo [0.0, 10.0]");
        }

    }

    public Double getGrauDeFama() {
        return this.grauDeFama;
    }

    public String toString() {
        return "Grau de Fama: " + this.getGrauDeFama();
    }
}
