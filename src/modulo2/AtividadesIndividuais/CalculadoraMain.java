package modulo2.AtividadesIndividuais;

//import modulo2.CalculadoraTax;

public class CalculadoraMain {
    public static void main(String[] args) {
        
    CalculadoraTax calctaxas = new CalculadoraTax();

    double resultadoTransf = calctaxas.trBancarias(100.00);

    System.out.printf("O valor da taxa é:  %.8f \n", resultadoTransf);

    for(int contador = 1; contador <=5; contador ++){
        double resultadoSaque = calctaxas.taxaSaque(50);
        System.out.printf("O valor do Saque é:  %.2f \n", resultadoSaque);
    }
    }
}
