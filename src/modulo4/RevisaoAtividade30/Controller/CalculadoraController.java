package modulo4.RevisaoAtividade30.Controller;

import modulo4.RevisaoAtividade30.Model.Calculadora;

public class CalculadoraController {
    public int soma(Calculadora calc){
        int resultado = calc.numero1 + calc.numero2;
        return resultado;
    }

    public int subtracao(Calculadora calc){
        int resultado = calc.numero1 - calc.numero2;
        return resultado;
    } 
    
    public int multiplicacao(Calculadora calc){
        int resultado = calc.numero1 * calc.numero2;
        return resultado;
    } 
    
    public double divisao(Calculadora calc){
        int resultado = calc.numero1 / calc.numero2;
        return resultado;
    }
}
