package models;

import enums.VeiculoDeCritica;

public class Critico extends Pessoa {
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

    @Override
    public void setIdade(Integer idade) {
        if (idade >= 18) {
            super.setIdade(idade);
        } else {
            System.out.println("A Idade não pode ser menor que 18 anos.");
        }
    }
}
