package modulo3.ATP19;

public class Numeros {
   public static void main(String[] args) {
        int[] numeros = new int[10];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        numeros[5] = 6;
        numeros[6] = 7;
        numeros[7] = 8;
        numeros[8] = 9;
        numeros[9] = 10;

        // percorrendo o array através do laço for
        for(int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
} 
