package modulo3.ATP18;

public class TelaPrincipalLoja {
    public static void main(String[] args) {

        Produto tpl = new Produto();

        tpl.setCodigo(321);
        int c = tpl.getCodigo();
        System.out.println("Codigo: " + c);

        tpl.setNome("geladeira");
        String n = tpl.getNome();
        System.out.println("Nome: " + n);

        tpl.setDescricao("grande");
        String d = tpl.getDescricao();
        System.out.println("Descrição: " + d);

        tpl.setValor(1000.00);
        double v = tpl.getValor();
        System.out.println("Valor: " + v);
        }
}
