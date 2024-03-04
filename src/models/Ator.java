package models;

import enums.Genero;

public abstract class Ator extends Pessoa {
    private Genero generoPrincipal;

    public Ator(String nome, Integer idade, Genero generoPrincipal) {
        super(nome, idade);
        this.setGeneroPrincipal(generoPrincipal);
    }

    public void setGeneroPrincipal(Genero generoPrincipal) {
        this.generoPrincipal = generoPrincipal;
    }

    public Genero getGeneroPrincipal() {
        return this.generoPrincipal;
    }

    public String toString() {
        return "Genêro: " + this.getGeneroPrincipal();
    }

    @Override
    public void setIdade(Integer idade) {
        if (idade >= 5) {
            this.idade = idade;
        } else {
            System.out.println("A idade não pode ser menor que 5 anos.");
        }
    }
}
