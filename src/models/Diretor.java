package models;

public class Diretor extends Pessoa {
    private String nacionalidade;

    public Diretor(String nome, Integer idade, String nacionalidade) {
        super(nome, idade);
        this.setNacionalidade(nacionalidade);
    }

    public void setNacionalidade(String nacionalidade) {
        if (nacionalidade != null && !nacionalidade.isBlank()) {
            this.nacionalidade = nacionalidade;
        } else {
            System.out.println("A nacionalidade não pode ser nula ou vazia");
        }
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public String toString() {
        return "Nacionalidade: " + this.getNacionalidade();
    }
}

