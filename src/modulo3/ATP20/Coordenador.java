package modulo3.ATP20;

public class Coordenador extends Funcionario{
    private String curso;
    private String coordenador;
    private String bonus;

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }
    public String getCoordenador() {
        return coordenador;
    }
    
    public void setBonus(String bonus) {
        this.bonus = bonus;
    }
    public String getBonus() {
        return bonus;
    }
}
