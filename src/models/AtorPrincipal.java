package models;

public class AtorPrincipal extends Pessoa {
    private Integer anosDeExperiencia;

    public void setAnosDeExperiencia(Integer anosDeExperiencia) {
        this.anosDeExperiencia = anosDeExperiencia;
    }

    public Integer getAnosDeExperiencia() {
        return this.anosDeExperiencia;
    }

    public String toString() {
        return "Anos de Experiência: " + this.getAnosDeExperiencia();
    }
}
