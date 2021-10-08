package modulo3.Aula17.P1;

public class Tela {
    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente(1555.00, "cp9898-9");
        System.out.println(cc1.getSaldo());

        ContaPoupança cp1 = new ContaPoupança("cpa15165");
        cp1.deposito(150.00);
        System.out.println(cp1.getSaldo());

        System.out.println(cc1);
        System.out.println(cp1);
    }
}
