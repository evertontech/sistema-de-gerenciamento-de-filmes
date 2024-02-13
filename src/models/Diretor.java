package models;

public class Diretor extends Pessoa {
    private String nacionalidade;

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public String toString() {
        return "Nacionalidade: " + this.getNacionalidade();
    }
}

