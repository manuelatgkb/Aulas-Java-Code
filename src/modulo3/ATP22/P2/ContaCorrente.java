package modulo3.ATP22.P2;

public class ContaCorrente {
    private double saldo;
    private double taxaSaque;
    private double codigoCliente;

     //Crie um método Construtor na classe Conta Corrente que 
     //receba o valor do saldo e do código do cliente;
    public ContaCorrente(double saldo, double taxaSaque, double codigoCliente){
        this.saldo = saldo;
        this.codigoCliente = codigoCliente;
    }

}
