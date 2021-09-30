package modulo2;

import modulo1.atividadesPraticas.CalculadoraTaxas;

public class CalculadoraMain {
    public static void main(String[] args) {
        
    
    CalculadoraTax calctaxas = new CalculadoraTax();

    calctaxas.trBancarias(100.00, 0.001);
    calctaxas.taxaSaque(1.30, 5);
    }
}
