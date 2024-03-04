package models;

import enums.VeiculoDeCritica;

public class Critico extends Pessoa {
    private VeiculoDeCritica veiculoDeCritica;

    public Critico(String nome, Integer idade, VeiculoDeCritica veiculoDeCritica) {
        super(nome, idade);
        this.setVeiculoDeCritica(veiculoDeCritica);
    }

    public void setVeiculoDeCritica(VeiculoDeCritica veiculoDeCritica) {
        this.veiculoDeCritica = veiculoDeCritica;
    }

    public VeiculoDeCritica getVeiculoDeCritica() {
        return this.veiculoDeCritica;
    }

    public String toString() {
        return super.toString() + ", Veículo de crítica: " + this.getVeiculoDeCritica();
    }
}
