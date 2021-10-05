package modulo3.aula13;

public class ArraysString2 {
    public static void main(String[] args) {
        String[] nomes = new String[5];

        nomes[0] = "Maykon ";
        nomes[1] = "João ";
        nomes[2] = "Maria ";
        nomes[3] = "Marta ";
        nomes[4] = "Anna ";

        // percorrendo o array através do laço for it
        for (String n : nomes){
            System.out.println(n);
        }
    }
}
