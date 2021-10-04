package modulo3.ATP18;

public class ContaCorrente {
    private int agencia;
    private int numero;
    private int codigoCliente;
    private double saldo;

    public void setAgencia(int agencia){
        if(agencia>0){
        this.agencia = agencia;
        }
    }
    public int getAgencia(){
        return this.agencia;
    }
    public void setNumero(int numero){
        if(numero>0){
        this.numero = numero;
        }
    }
    public int getNumero(){
        return this.numero;
    }
    public void setCodigoCliente(int codigoCliente){
        if(codigoCliente>0){
        this.codigoCliente = codigoCliente;
        }
    }
    public int getCodigoCliente(){
        return this.codigoCliente;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return this.saldo;
    }
}
