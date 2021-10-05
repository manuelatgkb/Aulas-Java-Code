package modulo3.ATP20;

public class Aluno extends Pessoa{
    private String curso;
    private String turma;

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }
    public String getTurma() {
        return turma;
    }
}
