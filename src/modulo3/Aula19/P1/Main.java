package modulo3.Aula19.P1;

public class Main {
    public static void main(String[] args) {
        String nome = "Inêz";
        String nome2 = "inêz";
        nome = nome.toUpperCase();
        nome2 = nome2.toUpperCase();

        boolean igual = nome.equals(nome2);
    //não estou salvando a variável
        System.out.println(igual);
        System.out.println(nome);
        System.out.println(nome2);


        
    }
}
