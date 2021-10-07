package modulo3.ATP22.P3;


public class Tela {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int s1 = calc.soma1(10, 20); 
        double s2 = calc.soma2(11, 22);
        float s3 = calc.soma3( 23, 34, 33); 
        long s4 = calc.soma4( 34, 44, 33); 
    }
}
