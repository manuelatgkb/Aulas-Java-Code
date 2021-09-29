package modulo1.aula011;

public class Calculadora{
    int n1;
    int n2;
    String nome;

    public int somar(int n1, int n2){
        
        int s = n1 + n2;
        return s;
    }
    public int subtrair(int n1, int n2){
        int sub = n1 - n2;
        return sub;
        }
    public int dividir(int n1, int n2){
        int div = n1 / n2;
        return div;
            }
    public int multiplicar(int n1, int n2){
        int mult = n1 * n2;
        return mult;
                }
    private boolean valida(int n){
        if(n > 0){
            return false;
        } 
        return true;
    }
    
}