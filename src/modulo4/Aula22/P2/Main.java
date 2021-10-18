public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Pessoa1";
        PessoaFisica pessoaFisica1 = new pessoaFisica();
        pessoaFisica1.nome = "Pessoa Fisica 1";
        pessoaFisica1.cpf = "282828283";

        Object obj = new Object();

        //System.out.println(pessoa1.toString());

       // System.out.println(pessoaFisica1.toString());

        Pessoa pessoa2 = pessoaFisica1;
       // System.out.println(pessoa2.toString());

        Object obj2 = pessoaFisica1;
        //System.out.println(obj2.toString());
        imprimir(obj1);
        imprimir(pessoa1);
        imprimir(pessoaFisica1);

        int soma = 10+10;
        String nome = "Maykon" + "Granemann";


    }

    public static void imprimir(Object obj){
        System.out.println(obj.toString());
    }
}
