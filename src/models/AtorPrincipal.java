package models;

import enums.Genero;

public class AtorPrincipal extends Ator {
    private Integer anosDeExperiencia;

    public AtorPrincipal(String nome, Integer idade, Genero generoPrincipal, Integer anosDeExperiencia) {
        super(nome, idade, generoPrincipal);
        this.setAnosDeExperiencia(anosDeExperiencia);
    }

    public void setAnosDeExperiencia(Integer anosDeExperiencia) {
        if (anosDeExperiencia != null && anosDeExperiencia > 0) {
            this.anosDeExperiencia = anosDeExperiencia;
        } else {
            System.out.println("Os anos de experiencia deve ser maior ou igual a zero");
        }
    }

    public Integer getAnosDeExperiencia() {
        return this.anosDeExperiencia;
    }

    public String toString() {
        return "Anos de Experiência: " + this.getAnosDeExperiencia();
    }
}
