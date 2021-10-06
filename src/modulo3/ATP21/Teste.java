package modulo3.ATP21;
public class Teste {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.setSaldo(10000.00);
        c.setCodigo_cliente("ABC");
        System.out.printf("Código do cliente: %s, Saldo da Conta: %f ", c.getCodigo_cliente(), c.getSaldo());
        c.transferencia(180);
        System.out.printf("Valor da transferência: %f, Novo Saldo: %f", 180.00, c.getSaldo());

        ContaCorrente cc = new ContaCorrente();
        cc.setSaldo(2000.00);
        cc.transferencia(100.00);
        cc.setCodigo_cliente("DEF");

        double transferencia2 = 50;
        for (int i = 1; i<=10; i++){
            cc.transferencia(transferencia2);
            System.out.printf("\n Operação n %d: uma tansferencia de %.2f foi realizada!\n", i, transferencia2);
            System.out.println("Codigo Cliente: " + cc.getCodigo_cliente());
            System.out.printf("\n Código do cliente: %s,\n Saldo da Conta: %f,\n transferência : %f,\n", cc.getCodigo_cliente(), cc.getSaldo(), 100.00);
        }
        
    }
}
