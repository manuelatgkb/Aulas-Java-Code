package modulo3.Aula20.MVC.View;

import java.util.Scanner;

public class ViewPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma opção");
        int opcao = Integer.parseInt(sc.nextLine());

        switch(opcao){
            case 1: 
            ProdutoView pv = new ProdutoView();
            pv.executa();
            break;
            case 2: 
            ProdutoView cv = new ProdutoView();
            pv.executa();
            break;
        }
    }
}
