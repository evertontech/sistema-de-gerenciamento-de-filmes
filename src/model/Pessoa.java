package model;

public abstract class Pessoa {
    private String nome;
    private Integer idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getIdade() {
        return this.idade;
    }
    
    public String toString() {
        return "Nome: " + this.getNome() +
                ", Idade: " + this.getIdade();
    }
}
