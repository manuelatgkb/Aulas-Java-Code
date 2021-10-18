import modulo4.Aula22.Main;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Prod1";
        produto1.descricao = "Prod1 desc";
        produto1.valor = 1000.00;
        Eletrodomestico eletrodomestico1 = new Eletrodomestico ();
        eletrodomestico1.nome = "eletro1";
        eletrodomestico1.descricao = "Eletro 1 desc";
        eletrodomestico1.voltagem = 220;

        Produto produto2 = eletrodomestico1;
        Produto produto3 = new Eletrodomestico();

        Eletrodomestico eletrodomestico2 = (Eletrodomestico)produto1;
    }

    public static void imprimir(Object obj){
        if(obj instanceof Eletrodomestico){
            System.out.println("É um Eletrodoméstico");
            Eletrodomestico eletro = (Eletrodomestico)obj;
            System.out.println(prod.nome);
            System.out.println(prod.descricao);
            System.out.println(prod.valor);
            System.out.println(prod.voltagem);
        }else if(obj instanceof Produto){
            System.out.println("É um produto");
            Produto prod = (Produto)obj;
            System.out.println(prod.nome);
            System.out.println(prod.descricao);
            System.out.println(prod.valor);
        }
    }
}
