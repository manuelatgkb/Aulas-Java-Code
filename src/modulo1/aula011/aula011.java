package modulo1.aula011;

public class aula011 {
    public static void main(String[] args) {
        int numero = 10;
        //criando uma instancia de classe de produto(objeto)
        Produto produto1 = new Produto();
        produto1.nome = "Tv";
        produto1.descricao = "Tv da Xuxa";
        produto1.valor = 99.98;

        Produto produto2 = new Produto();
        produto2.nome = "Smartfone";
        produto2.descricao = "Telefone caro";
        produto2.valor = 13999.99;

        System.out.println(numero);
        System.out.println(produto1.nome);
    }
}
