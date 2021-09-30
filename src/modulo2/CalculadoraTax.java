package modulo2;

public class CalculadoraTax{
        public double taxaTransf = 0.001; 
        public double taxaSaque = 1.30; 
        public int qtdSaque; 

        double trBancarias(double valorTransferido){
            double ValorTaxa = valorTransferido * taxaTransf;
            return ValorTaxa;
        } 

        double taxaSaque(double valorSaque){
            qtdSaque++;
            if(qtdSaque %5 ==0)
                return valorSaque + taxaSaque;
            return valorSaque;
        }
}
