package models;

import enums.Genero;

public abstract class Ator extends Pessoa {
    private Genero generoPrincipal;

    public void setGeneroPrincipal(Genero generoPrincipal) {
        this.generoPrincipal = generoPrincipal;
    }

    public Genero getGeneroPrincipal() {
        return this.generoPrincipal;
    }

    public String toString() {
        return "Genêro: " + this.getGeneroPrincipal();
    }
}
