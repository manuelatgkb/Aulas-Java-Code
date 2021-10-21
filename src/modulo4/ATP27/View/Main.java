package modulo4.ATP27.View;

import modulo4.ATP27.Controller.ControllerF;
import modulo4.ATP27.Controller.ControllerS;
import modulo4.ATP27.Model.Filmes;
import modulo4.ATP27.Model.Series;

public class Main {

    public static void main(String[] args) {
        ControllerF cf = new ControllerF();
        ControllerS cs = new ControllerS();

        Filmes f1 = new Filmes();
        f1.id = 47747;
        f1.titulo = "Les Enfants du Paradis";
        f1.ano = 1978;

        Filmes f2 = new Filmes();
        f2.id = 47747;
        f2.titulo = "Sisi";
        f2.ano = 1978;

        Series s1 = new Series();
        s1.id = 53535;
        s1.titulo = "Game of Thrones";
        s1.temporadas = "7";

        Series s2 = new Series();
        s2.id = 53535;
        s2.titulo = "La Casa de papel";
        s2.temporadas = "4";

        cf.create(f1);
        System.out.println("Criado: " + f1.titulo);
        cf.create(f2);
        System.out.println("Criado: " + f2.titulo);
        cs.create(s1);
        System.out.println("Criado: " + s1.titulo);
        cs.update(s2);
        System.out.println("Listando Serie");
        listar(cs);
        System.out.println("Listando Filme");
        listar(cf);
        System.out.println("Listando filme 2");
        System.out.println(cf.read());

        cf.delete(f1);
        System.out.println("Deletado: " + f1.titulo);
        cs.delete(s1);
        System.out.println("Deletado: " + s1.titulo);

    }


    static public void listar(Object obj){
        if(obj instanceof ControllerF){
            ControllerF cf = (ControllerF)obj;

            for (Filmes filmes : cf.read()) {
                System.out.println(filmes);
            }
        }else if (obj instanceof ControllerS){
            ControllerS cs = (ControllerS)obj;

            for (Series series : cs.read()) {
                System.out.println(series);
            }
                
        }
        
    }

}
