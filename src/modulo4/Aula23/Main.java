package modulo4.Aula23;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Jojo";
        p1.sobrenome= "DoCalypso";

        Carro c1 = new Carro();
        c1.marca = "VW";
        c1.modelo = "BrasiliaAmarela";

        Dados dados = new Dados();
        System.out.println(dados.add(p1));
        System.out.println(dados.add(c1));
        System.out.println(dados.add(p1));
        System.out.println(dados.add(c1));
        System.out.println(dados.add(p1));
        
        




        /*int n = 10;
        //criação de arrays
        int[] numeros = new int[10];
        //aray list
        ArrayList<Double> numeros2 = new ArrayList<Double>();
        */
    }
}
