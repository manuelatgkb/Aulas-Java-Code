import modulo3.ATP21.Conta;

public class Teste {
    public static void main(String[] args) {
        Conta c = new Conta();
        Conta_corrente cc = new conta_corrente();
        
        c.setSaldo(10000.00);
        c.setCodigo_cliente("ABC");
        cc.setSaldo(2000.00);
        cc.setCodigo_cliente("DEF");
    }
}
