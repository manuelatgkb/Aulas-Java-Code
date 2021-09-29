package modulo1.Revisao;
import java.util.Scanner;

public class a18cadastreBousorama {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte option;
        char continuer = 'N';

        do{
            System.out.println("\n\n============== Bienvenu sur le Pret Personnel Boursorama  ==================");
            System.out.println("\t1-Pret Personnel");
            System.out.println("\t2-Crédit Immobilier");
            System.out.println("\t3-Crédit Auto");
            System.out.print("Choisissez une option: ");
            option = Byte.parseByte(sc.nextLine()); 

                switch(option){
                case 1:
                    System.out.println("Pret Personnel");
                break;

                case 2:
                    System.out.println("Crédit Immobilier");
                break;

                case 3:
                    System.out.println("Crédit Auto");
                break;

                default:
                    System.out.println("L´option choisie n´est pas valable");
                break;

            }

            if(option > 0 && option < 5){
                do{
                    System.out.print("Si vou désirez sortir choisissez 'S'. Pour revenir sur le menu principal, choisissez 'V': ");
                    continuer = sc.nextLine().toUpperCase().charAt(0);
                }while(continuer != 'V' && continuer !='S');
            }

        }while (option < 1 || option > 3 || continuer == 'V');

        sc.close();
    }
}
