package modulo1.aula011;

public class ContaCorrente {
    private double saldo;

    public void depositar(double valor){
        saldo+= valor;
    }

    protected double sacar(double valor){
        saldo -= valor;
        return valor;
    }
    public double saldo(){
        return saldo;
    }
}
