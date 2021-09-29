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

        imprimir("A primeira pessoa é " + pessoa1.nome, pessoa1.sobrenome, pessoa1.idade);
        imprimir("A segunda pessoa é " + pessoa2.nome, pessoa2.sobrenome, pessoa2.idade);

    }

    static void cabecalho(){
        System.out.println("\n ===========Cadastro de Pessoas===========");
    }

    static void imprimir(String nome, String sobrenome, int idade){
        System.out.printf("\n %s %s %d anos.", nome, sobrenome, idade);

    }
}
