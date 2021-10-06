package modulo3.ATP21;

public class ContaCorrente extends Conta{
    private double taxa_transferencia = 10.50;
    private double taxa_manutencao = 2.50;
    private int numero_transferencias = 0;


//Altere a classe Conta Corrente construindo um método para sobrescrever 
//o método de transfêrencia, da classe Conta.
//O novo método deve utilizar as funções do método principal, 
//além de debitar a taxa de transferência do saldo da conta.
    @Override
    public void transferencia(double valorTransferencia){
        numero_transferencias ++;
        super.transferencia(valorTransferencia);
        double saldo = this.getSaldo() - taxa_transferencia;
        this.setSaldo(saldo);
//O método de transferência da Conta Corrente também deve armazenar, 
//no atributo número de transferencias, a quantidade de transferências realizadas e 
//a cada 5 transferências deve debitar do saldo, o valor da taxa de manutenção de conta.

        if(numero_transferencias %5 ==0){
            saldo = this.getSaldo() - taxa_manutencao;
            this.setSaldo(saldo);
        }
    }
}
