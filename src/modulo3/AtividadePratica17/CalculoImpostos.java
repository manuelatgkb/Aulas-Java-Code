package modulo3.AtividadePratica17;

public class CalculoImpostos {

    //A classe deve manter em variáveis privadas o valor de cada imposto
    private double ISS = 0.00003;
    private double IOF = 6.38;
    private double IR;
    
    public double CalculoISS(double valor){
        double valorTaxa = valor * ISS; 
        return valorTaxa;
    }

    public double CalculoIOF(double valor){
        double valorTaxa = valor * IOF; 
        return valorTaxa;

    }

    public double CalculoIR(double valor){
        double valorTaxa = valor - IR; 
        return valorTaxa;
        
    }
}

