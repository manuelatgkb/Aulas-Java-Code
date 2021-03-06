package modulo4.ATP26;

public class Aluno extends Pessoa{
    public String matricula;
    public String turma;
    public String curso;

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Aluno){
            Aluno outroAluno = (Aluno)obj;
            if( this.matricula.equals(outroAluno.matricula) && this.turma.equals(outroAluno.turma)
            && this.curso.equals(outroAluno.curso)&& super.equals(outroAluno)){
            return true;
        }
    }
        return false;
    }

    @Override
    public String toString(){
        String retorno = super.toString() + " ; " + this.matricula + " ; " + this.turma + " ; " + this.curso;
        return retorno;
    }
}
