package modulo4.ATP26;

public class Aluno extends Pessoa{
    public String matricula;
    public String turma;
    public String curso;

    @Override
    public String toString(){
        return this.matricula + "," + this.turma + "," + this.curso;
    }
}
