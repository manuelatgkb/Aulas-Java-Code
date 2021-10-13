package modulo3.Aula19.P1;

public class Main {
    public static void main(String[] args) {
        String nome = "Inêz";
        String nome2 = "inêz";
       // nome = nome.toUpperCase();
        //nome2 = nome2.toUpperCase();

        boolean igual = nome.toUpperCase().equals(nome2.toUpperCase());
    //não estou salvando a variável
        System.out.println(igual);
        System.out.println(nome);
        System.out.println(nome2);
    }
}
