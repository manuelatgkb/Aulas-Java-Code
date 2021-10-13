package modulo3.ExerciciosExtra.R09;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<Produto>();

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o nome do produto (%d): ", i);
            String nome = sc.nextLine();
            System.out.printf("Digite a descrição do produto (%d): ", i);
            String descricao = sc.nextLine();
            System.out.printf("Digite o valor do produto (%d): ", i);
            Double valor = Double.parseDouble(sc.nextLine());
            Produto p = new Produto();
            p.setNome(nome);
            p.setDescricao(descricao);
            p.setValor(valor);

            produtos.add(p);
            
        }

        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
