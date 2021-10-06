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
        cc.transferencia(100.00);        
        cc.transferencia(100.00);
        cc.transferencia(100.00);
        cc.transferencia(100.00);
        cc.transferencia(100.00);

        System.out.printf("\n Código do cliente: %s,\n Saldo da Conta: %f,\n transferência : %f,\n", c.getCodigo_cliente(), c.getSaldo(), 100.00);
    }
}
