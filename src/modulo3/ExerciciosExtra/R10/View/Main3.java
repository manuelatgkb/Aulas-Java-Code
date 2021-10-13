package modulo3.ExerciciosExtra.R10.View;

import java.util.ArrayList;

import modulo3.ExerciciosExtra.R10.Domain.Categoria;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Categoria> cats = new ArrayList<Categoria>();
        Categoria cat0 = new Categoria(0);
        Categoria cat1 = new Categoria(1);
        Categoria cat2 = new Categoria(2);

        cats.add(cat0);
        cats.add(cat1);

        for (Categoria categoria : cats) {
            System.out.println(categoria);
            cats.add(cat2);
        }
    }
}
