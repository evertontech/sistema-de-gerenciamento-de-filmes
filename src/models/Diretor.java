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

    @Override
    public void setIdade(Integer idade) {
        if (idade >= 18) {
            super.setIdade(idade);
        } else {
            System.out.println("A Idade não pode ser menor que 18 anos.");
        }
    }
}

