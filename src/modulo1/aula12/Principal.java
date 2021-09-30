package modulo1.aula12;

public class Principal{
    private double taxaTransacao = 0.001;
    private double taxaSaque = 1.30;
    private int numSaques;

    public double taxaTransacao(double valor){
        double resultTaxaTransf = valor * (taxaTransacao / 100);
        return resultTaxaTransf;
    }

    public double taxaSaque(double valor){
        numSaques ++;
        if (numSaques % 5 == 0) {
            return taxaSaque;
        }
        return 0;
    }
}  
