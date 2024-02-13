package models;

import enums.VeiculoDeCritica;

public class Critico {
    private VeiculoDeCritica veiculoDeCritica;

    public void setVeiculoDeCritica(VeiculoDeCritica veiculoDeCritica) {
        this.veiculoDeCritica = veiculoDeCritica;
    }

    public VeiculoDeCritica getVeiculoDeCritica() {
        return this.veiculoDeCritica;
    }

    public String toString() {
        return "Veículo de crítica: " + this.getVeiculoDeCritica();
    }
}
