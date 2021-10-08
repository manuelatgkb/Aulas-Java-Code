package modulo3.ATP22.P2;

public class ContaCorrente {
    private double saldo;
    private double saldoInicial;
    private double saques;
    private double taxaSaque = 1.50;
    private double codigoCliente;

     //Crie um método Construtor na classe Conta Corrente que 
     //receba o valor do saldo e do código do cliente;
    public ContaCorrente(double saldo, double codigoCliente){
        this.saldoInicial = 9000.99;
        this.saldo = saldo;
        this.codigoCliente = codigoCliente;
    }

    public void saque (double valorSaque){
        this.saldo -= (valorSaque + this.taxaSaque);   
    }
    public void deposito(double valorDeposito){
        this.saldo += valorDeposito;
    }

    @Override
    public String toString(){
        return "O Saldo inicial é: " + this.saldoInicial + "\nSaldo: " + this.saldo + " \n Código Cliente: " + this.codigoCliente + "\n Taxa de Saque: " + this.taxaSaque;
    
    }    
}
