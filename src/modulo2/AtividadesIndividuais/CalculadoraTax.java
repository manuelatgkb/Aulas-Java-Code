package modulo2.AtividadesIndividuais;

public class CalculadoraTax{
        private double taxaTransf = 0.00001; 
        private double taxaSaque = 1.30; 
        private int qtdSaque; 

        double trBancarias(double valorTransf){
            double ValorTaxa = valorTransf * taxaTransf;
            return ValorTaxa;
        } 

        double taxaSaque(double valorSaque){
            qtdSaque++;
            if(qtdSaque %5 == 0)
                return taxaSaque;
            return 0;
        }
}
