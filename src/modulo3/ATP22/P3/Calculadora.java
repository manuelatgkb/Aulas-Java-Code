package modulo3.ATP22.P3;

public class Calculadora {

    public int soma1(int v1, int v2){
        System.out.printf("Soma com 2 inteiros");
        return v1 + v2;
    }
    public double soma2(double v1, double v2){
        System.out.printf("Soma com 2 doubles");
        return v1+ v2;
    }
    public float soma3(float v1, float v2, float v3){
        System.out.println("Soma com 3 float");
        float rs3 = v1 + v2 + v3;
        return rs3;
    }
    public long soma4(long v1, long v2, long v3){
        System.out.println("Soma com 3 long");
        return v1+ v2 + v3;
    }
}
