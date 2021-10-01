package modulo2.AtividadesIndividuais.ResolucaodaAtividade16;

public class CalculadoraTaxas2 {
    private double taxaTransferencia = 0.00001;

    public double CalculadoraTaxaTransferencia(double valor){
        double valorTaxa = valor * taxaTransferencia; 
        return valorTaxa;
    }
}
