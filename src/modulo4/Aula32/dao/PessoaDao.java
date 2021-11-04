package modulo4.Aula32.dao;

import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.standard.RequestingUserName;


public class PessoaDao extends BaseDao<Pessoa>{
    public PessoaDao(){
        super("dados/pessoa.csv");
    }
    public ArrayList<Pessoa> list(){
        ArrayList<Pessoa> pessoas= new ArrayList<Pessoa>();
        try{
            Scanner sc = new Scanner(new File(this.filename));
            while(sc.hasNextLine()){
                String linha= sc.nextLine();
                Pessoa pessoa = new Pessoa(linha);
                pessoas.add(p);
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }return pessoas;
    } 

}
