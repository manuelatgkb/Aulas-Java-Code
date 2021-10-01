package modulo3.AtividadePratica17;

public class CalculoImpostos {

    //A classe deve manter em variáveis privadas o valor de cada imposto
    private double ISS = 0.00003;
    private double IOF = 6.38;
    private double IR;
    
    public double CalculoISS(double valor){
        double valorTaxaISS = valor * ISS; 
        return valorTaxaISS;
    }

    public double CalculoIOF(double valor){
        double valorTaxaIOF = valor * IOF; 
        return valorTaxaIOF;

    }

    public double CalculoIR(double valor){
        double valorTaxaIR = valor - IR; 
        return valorTaxaIR;
        
    }
}

