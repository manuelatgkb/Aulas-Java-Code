package modulo3.ExerciciosExtra.R10.View;

public class Main2 {
    public static void main(String[] args) {
        int[] n = new int[6];
        for (int i = 0; i < 5; i++) {
            n[i] = i;
        }
        for(int numeros : n){
            System.out.println(numeros);
            if(numeros == 0){
                n[5] = 18;
            }
        }
    }
}
