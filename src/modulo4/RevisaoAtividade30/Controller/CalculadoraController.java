package modulo4.RevisaoAtividade30.Controller;

import modulo4.RevisaoAtividade30.Model.Calculadora;


public class CalculadoraController {
    CalculadoraController calc = new CalculadoraController();

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
        double resultado = (double)calc.numero1 / (double)calc.numero2;
        return resultado;
    }
}
