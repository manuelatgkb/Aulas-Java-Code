package modulo3.ATP22.P3;


public class Tela {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int s1 = calc.soma1(10, 20); 
        double s2 = calc.soma2(11.1, 22.8);
        float s3 = calc.soma3( 23.2f, 34.8f, 33.10f); 
        long s4 = calc.soma4( 34, 44, 33); 
        
//imprimir os valores
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

    }
}
