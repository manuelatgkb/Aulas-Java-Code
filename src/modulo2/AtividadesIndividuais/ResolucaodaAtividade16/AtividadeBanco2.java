package modulo2.AtividadesIndividuais.ResolucaodaAtividade16;

public class AtividadeBanco2 {
    public static void main(String[] args) {
        CalculadoraTaxas2 calcTaxas = new CalculadoraTaxas2();
        double taxaT1 = calcTaxas.CalculadoraTaxaTransferencia(1000);
        double taxaT2 = calcTaxas.CalculadoraTaxaTransferencia(500);

        double taxaS1 = calcTaxas.calculaTaxaSaque(50);
        double taxaS2 = calcTaxas.calculaTaxaSaque(50);
        double taxaS3 = calcTaxas.calculaTaxaSaque(50);
        double taxaS4 = calcTaxas.calculaTaxaSaque(50);
        double taxaS5 = calcTaxas.calculaTaxaSaque(50);

        System.out.printf("Os valores de taxa de transferência forma %2f e %.2f \n", taxaT1, taxaT2);
        System.out.printf("Os valores de taxa de Saque forma %.2f, %.2f, %.2f, %.2f, %.2f \n", taxaS1, taxaS2, taxaS3, taxaS4, taxaS5);

    }
}
