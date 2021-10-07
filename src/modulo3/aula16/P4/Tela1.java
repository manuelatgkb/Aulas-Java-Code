package modulo3.aula16.P4;

public class Tela1 {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        double r1 = c.soma(10, 20);
        double r2 = c.soma(10, 20, 30); 
       // double r4 = c.soma2("10", "20");
        System.out.println(r2);  
    }
}
