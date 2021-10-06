package modulo3.ATP21;

public class Conta {
    private double saldo; 
    private String codigo_cliente;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setCodigo_cliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }
    public String getCodigo_cliente() {
        return codigo_cliente;
    }

    //metodo de transferência
    public void transferencia(double valor){
        double saldo_final = saldo - valor;
        this.saldo = saldo_final;
    }
}
