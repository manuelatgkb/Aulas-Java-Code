package modulo3.ATP18;

public class TelaPrincipalBanco {
    public static void main(String[] args) {

    ContaCorrente cc1 = new ContaCorrente();

    cc1.setAgencia(123);
    int ag = cc1.getAgencia();
    System.out.println("Agência: " + ag);

    cc1.setNumero(321);
    int n = cc1.getNumero();
    System.out.println("Número: " + n);

    cc1.setCodigoCliente(35);
    int ccl = cc1.getCodigoCliente();
    System.out.println("Código Cliente: " + ccl);

    cc1.setSaldo(10000.00);
    double s = cc1.getSaldo();
    System.out.println("Saldo: " + s);
    }
}