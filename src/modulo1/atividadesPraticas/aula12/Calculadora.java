package modulo1.atividadesPraticas.aula12;
import java.lang.annotation.Retention;
import java.util.Scanner;

import jdk.javadoc.internal.doclets.toolkit.taglets.ReturnTaglet;

public class Calculadora {
    double transferencias(double valorTransferido, double TaxasTransferencia){

        double taxa = valorTransferido + valorTransferido * TaxasTransferencia;
        System.out.printf("A taxa de transferencia é : ", taxa);
        return taxa;
    }

    double taxadesaque(double taxadesaque, double saque){
        numeroSaques ++;
        If(numeroSaques %5 == 0){
            return taxadesaque;
        }
            return 0; 
        System.out.printf("A taxa cobrada por saque é :" , taxadesaque);
        return taxadesaque;
    }
}
