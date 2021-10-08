package modulo3.Aula18.P2;

import java.util.ArrayList;

public class Principal {
    static ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

   public static void main(String[] args) {
       //CRUD
       
       Aluno a1 = new Aluno(1);
       a1.setNome("Michael Douglas");
       a1.setIdade(18);
       salvar(a1);

       Aluno a2 = new Aluno(2);
       a2.setNome("Michael Jordan");
       a2.setIdade(19);
       alterar(a2);
      
       for(Aluno aluno : listaAlunos){
           System.out.printf("Nome: %s - Idade: %d", aluno.getNome(), aluno.getIdade());
       }
    }
        //create
       static void salvar(Aluno a){
           listaAlunos.add(a);
       }
       
        //read
       static ArrayList<Aluno>listar(){
           return listaAlunos;
       }
        //update
        static void alterar(Aluno a){
            for (Aluno aluno : listaAlunos){
                if(aluno.getCodigo() == a.getCodigo()){
                    deletar(aluno);
                    salvar(a);

                }
            }
        }

        //delete
        static void deletar(Aluno a){
            listaAlunos.remove(a);
        }
}
