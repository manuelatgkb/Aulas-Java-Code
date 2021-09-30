package modulo1;

public class a4doubleFloat {
    public static void main(String[] args) {
        //float - Single Precision
        float minF = Float.MIN_VALUE;
        float maxF = Float.MAX_VALUE;
       //System.out.println(minF);
        //System.out.println(maxF);
    
        double nimD = Double.MIN_NORMAL;
        double maxD = Double.MAX_VALUE;
        //System.out.println(minD);
       // System.out.println(maxD);

        float salario = 1998.89f;
        //double sal1 = 1998.89;

        //conversao implicita
        //double valor = 8888.88f;
        double valor2 = salario;

        System.out.println(salario);
        System.out.println(valor2);
    }  
}

