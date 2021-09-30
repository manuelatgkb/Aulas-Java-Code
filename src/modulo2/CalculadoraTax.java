package modulo2;

public class CalculadoraTax{
        private double taxaTransf = 0.001; 
        private double taxaSaque = 1.30; 
        private int qtdSaque; 

        double trBancarias(double valorTransferido){
            double ValorTaxa = valorTransferido * taxaTransf;
            return ValorTaxa;
        } 

        double taxaSaque(double valorSaque){
            qtdSaque++;
            if(qtdSaque %4 == 0)
                return valorSaque + taxaSaque;
            return valorSaque;
        }
}
