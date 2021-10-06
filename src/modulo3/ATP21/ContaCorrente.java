package modulo3.ATP21;

public class ContaCorrente extends Conta{
    private double taxa_transferencia = 10.50;
    private double taxa_manutencao = 2.50;
    private int numero_transferencias = 0;


    @Override
    public void transferencia(double valorTransferencia){
        numero_transferencias ++;
        super.transferencia(taxa_transferencia);

        if(numero_transferencias %5 ==0){
            double saldo = this.getSaldo() - taxa_manutencao;
            this.setSaldo(saldo);
        }
    }
}
