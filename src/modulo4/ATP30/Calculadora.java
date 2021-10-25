package modulo4.ATP30;
public class Calculadora {
        int somar;
        int subtrair;
        int multiplicar;
        int dividir;

        String nome;
    
        public void imprimeMenu(){
        }
        public int somar(int n1, int n2){
             this.somar = n1 + n2;
            return somar;
        }
        public int subtrair(int n1, int n2){
            this.subtrair = n1 - n2;
            return subtrair;
            }
        public double dividir(int n1, int n2){
            this.dividir = n1 / n2;
            return dividir;
                }
        public int multiplicar(int n1, int n2){
            this.multiplicar = n1 * n2;
            return multiplicar;
        }
        
        private boolean valida(int n){
            if(n > 0){
                return false;
            } 
            return true;
        }
}
