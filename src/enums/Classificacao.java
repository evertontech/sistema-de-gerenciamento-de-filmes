package enums;

public enum Classificacao {
    LIVRE("Livre"),
    MAIOR_10("Maior que 10 anos de idade."),
    MAIOR_12("Maior que 12 anos de idade."),
    MAIOR_14("Maior que 14 anos de idade."),
    MAIOR_16("Maior que 16 anos de idade."),
    MAIOR_18("Maior que 18 anos de idade.");

    private final String nome;

    Classificacao(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return this.nome;
    }
}
