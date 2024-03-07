package enums;

public enum Genero {

    ACAO("Ação"),
    AVENTURA("Aventura"),
    COMEDIA("Comedia"),
    DRAMA("Drama"),
    FICCAO_CIENTIFICA("Ficção Científica"),
    HORROR("Horror"),
    ROMANCE("Romance"),
    SUSPENSE("Suspense"),
    OUTRO("Outro");

    private final String nome;

    Genero(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return this.nome;
    }
}
