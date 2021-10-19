package modulo4.ATP26;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Luizinho";
        p1.sobrenome = "Patinhas";
        p1.idade = "11";

        Pessoa p2 = new Pessoa();
        p2 = p1;


        Aluno a1 = new Aluno();
        a1.nome = "Zezinho";
        a1.sobrenome = "Patinhas";
        a1.idade = "11";
        a1.matricula = "123gg";
        a1.curso = "Desenho de Quadrinhos";
        a1.turma = "a";

        Aluno a2 = new Aluno();
        a2 = a1;

        Dados dds = new Dados();
        dds.add(p1);
        dds.add(a1);


        System.out.println(dds.contains(p1));
        System.out.println(dds.contains(a1));

        System.out.println(dds.add(p1));
        System.out.println(dds.add(a1));

        System.out.println(dds.contains(p1));
        System.out.println(dds.contains(a1));


        System.out.println(dds.add(p1));
        System.out.println(dds.add(a1));
        System.out.println(dds.add(p1));
        dds.size();
        
        Pessoa px = new Pessoa();
        px.nome = "Luizinho";
        px.sobrenome = "Patinhas";
        px.idade = "11";
        System.out.println(dds.remove(px));
        
    }
}
