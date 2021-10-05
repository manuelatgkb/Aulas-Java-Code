package modulo3.ATP20;

public class Universidade {
    public static void main(String[] args) {
        Funcionario f = new Funcionario(); 
        f.setNome("Maykon");
        f.setSobrenome("Diego");
        f.setMatricula(99999.000);
        f.setDepartamento("Formação");
        f.setSalario(10000.00);

        Coordenador c = new Coordenador();
        c.setNome("Ana");
        c.setSobrenome("Souza");
        c.setMatricula(88888.000);
        c.setDepartamento("Coordenação");
        c.setSalario(20000.00);

        Aluno a = new Aluno();
        a.setNome("Clarissa");
        a.setSobrenome("Souza");
        a.setMatricula(292929.99);
        a.setCurso("Biologia");
        a.setTurma("b");


        System.out.printf("Nome : , %s ", f.getNome());
        System.out.printf("Sobrenome :, %s ", f.getSobrenome());
        System.out.printf("Matricula :, %f", f.getMatricula());
        System.out.printf("Departamento :, %s", f.getDepartamento());
        System.out.printf("Salário: , %f", f.getSalario());

        System.out.printf("Nome : , %s ", c.getNome());
        System.out.printf("Sobrenome :, %s ", c.getSobrenome());
        System.out.printf("Matricula :, %f", c.getMatricula());
        System.out.printf("Departamento : %s", c.getDepartamento());
        System.out.printf("Salário: , %f", c.getSalario());

        System.out.printf("Nome : , %s ", a.getNome());
        System.out.printf("Sobrenome :, %s ", a.getSobrenome());
        System.out.printf("Matricula :, %f", a.getMatricula());
        System.out.printf("Curso : %s", a.getCurso());
        System.out.printf("Turma : , %s", a.getTurma());
    }
}
