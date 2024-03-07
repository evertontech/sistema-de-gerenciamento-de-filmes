package enums;

public enum VeiculoDeCritica {
    SITE("Site"),
    REVISTA("Revista"),
    JORNAL("Jornal"),
    CANAL_YOUTUBE("Canal do YouTube"),
    PODCAST("Podcast");

    private final String nome;

    VeiculoDeCritica(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return this.nome;
    }
}
