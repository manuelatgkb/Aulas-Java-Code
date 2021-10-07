package modulo3.ATP22.P2;

public class ContaCorrente {
    private double saldo;
    private double taxaSaque = 1.50;
    private double codigoCliente;

     //Crie um método Construtor na classe Conta Corrente que 
     //receba o valor do saldo e do código do cliente;
    public ContaCorrente(double saldo, double codigoCliente){
        this.saldo = saldo;
        this.codigoCliente = codigoCliente;
    }

    public double Saque (double valor){
        double novoSaldo = saldo - (valor + taxaSaque);   
        return novoSaldo;     
    }
    public double Deposito(double valor){
        double Deposito =  saldo + valor; 
        return Deposito;
    }
}
