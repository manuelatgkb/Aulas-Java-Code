package modulo3.Aula18.P1;

import java.util.ArrayList;

public class TelaPrincipal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNomeCompleto("Cláudia Leite");

        Pessoa p2 = new Pessoa();
        p2.setNomeCompleto("Ivete Sangalo");

        Pessoa p3 = new Pessoa();
        p3.setNomeCompleto("Chiclete com Banana");

        //Pessoa[] pessoas = new Pessoa[3];
        
        ArrayList<Pessoa> ap = new ArrayList<Pessoa>();
        ap.add(p1);  
        ap.add(p2);         
        ap.add(p3);    
        ap.remove(p2);
        for (Pessoa p : ap){
            System.out.println(p.getNomeCompleto());
        }
    }
}
