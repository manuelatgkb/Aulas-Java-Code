package modulo1;

import java.util.Scanner;

//import jdk.javadoc.internal.tool.Main;

public class a5nextNextline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //next.line lê a linha todoa
        String linha = sc.nextLine();
        System.out.println("Foi lido : " + linha);
        // next lê somente até o primeiro espaço
        String linha2 = sc.next();
        System.out.println("Foi lido 2 : " + linha2);

        int n1 = sc.nextInt(); //le um numero inteiro até o espaço ou enter
        System.out.println("Foi lido 4 : " + n1);

        int n2 = Integer.parseInt(sc.nextLine()); //soluçao para ler uma linha e pegar a parte numérica
        System.out.println("Foi lido 5 : " + n2);

        double sal1 = Double.parseDouble(sc.nextLine());
        float sal2 = Float.parseFloat(sc.nextLine());

    }
}

