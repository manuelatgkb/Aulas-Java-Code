package modulo1.atividadesPraticas;

public class atividade15 {
    public static void main(String[] args) {
        cabecalho();

        PessoaAtv15 pessoa1 = new PessoaAtv15();
        pessoa1.nome = "Xuxa";
        pessoa1.sobrenome = "Meneguel";
        pessoa1.idade = 50; 

        PessoaAtv15 pessoa2 = new PessoaAtv15();
        pessoa2.nome = "Mara";
        pessoa2.sobrenome = "Maravilha";
        pessoa2.idade = 50; 

        pessoa1.imprimir();
        pessoa2.imprimir();
    }

    static void cabecalho(){
        System.out.println("\n ===========Cadastro de Pessoas===========");
    }

    /*static void imprimir(){
        System.out.printf("\n %s %s %d anos.", nome, sobrenome, idade);

    }*/
}
