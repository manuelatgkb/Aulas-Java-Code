package modulo4.ATP28.View;

import modulo4.ATP28.Controller.ControllerPFisica;
import modulo4.ATP28.Controller.ControllerPJuridica;
import modulo4.ATP28.Model.PessoaFisica;
import modulo4.ATP28.Model.PessoaJuridica;

public class Main {
    public static void main(String[] args) {

        ControllerPFisica cpf = new ControllerPFisica();
        ControllerPJuridica cpj = new ControllerPJuridica();


//Pessoas físicas: 
        PessoaFisica pf1 = new PessoaFisica();
        pf1.id = 01;
        pf1.cpf = "04026882641";
        pf1.enderecoRes.logradouro = "Rua Brasil 55";

        PessoaFisica pf2 = new PessoaFisica();
        pf2.id = 03;
        pf2.cpf = "04026882641";
        pf2.enderecoRes.logradouro = "Rua Brasil 55";

        PessoaFisica pf3 = new PessoaFisica();
        pf3.id = 03;
        pf3.cpf = "04026882641";
        pf3.enderecoRes.logradouro = "Rua Brasil 55";


//Pessoas Jurídicas: 
        PessoaJuridica pj1 = new PessoaJuridica();
        pj1.id = 02;
        pj1.cnpj = "2828282";
        pj1.enderecoCom.logradouro = "Av Castelo Branco";

        PessoaJuridica pj2 = new PessoaJuridica();
        pj2.id = 04;
        pj2.cnpj = "2828282";
        pj2.enderecoCom.logradouro = "Av Castelo Branco";

        PessoaJuridica pj3 = new PessoaJuridica();
        pj3.id = 04;
        pj3.cnpj = "2828282";
        pj3.enderecoCom.logradouro = "Av Castelo Branco";
//Cabeçalho
        System.out.println("_______________Cadastro de Pessoas__________________");

//chamando create:
        cpf.create(pf1);
        System.out.println("Pessoa Físca id: " + pf1.id + "CPF: " + pf1.cpf);
        cpf.create(pf2);
        System.out.println("Pessoa Físca id: " + pf2.id + "CPF: " + pf2.cpf);
        cpj.create(pj1);
        System.out.println("Pessoa Jurídica id: " + pj1.id + "CNPJ: " + pj1.cnpj);
        cpj.create(pj2);
        System.out.println("Pessoa Jurídica id: " + pj2.id + "CNPJ: " + pj2.cnpj);

//Chamando Update

        cpf.update(pf3);
        System.out.println("Update da pessoa física 3, Id:  " + pf3.id);
        listar(cpf);
        System.out.println("Lista de Pessoas Físicas: " + cpf);
        listar(cpj);
        System.out.println("Lista de Pessoas Jurídicas: " + cpj);

//Chamando read 
        System.out.println("Lendo Pessoas Físicas");
        System.out.println(cpf.read());
        System.out.println("Lendo Pessoas Jurídicas");
        System.out.println(cpj.read());


//chamando delete
        cpf.delete(pf1);
        System.out.println("Deletado Pessoa Física 1, Id : " + pf1.id);
        cpj.delete(pj1);
        System.out.println("Deletado Pessoa Jurídica 1, Id : " + pj1.id);
    }

    //mensagem final

    //Listando
    static public void listar(Object obj){
        if(obj instanceof ControllerPFisica){
            ControllerPFisica cpf = (ControllerPFisica)obj;

            for (PessoaFisica pf : cpf.read()) {
                System.out.println(pf);
            }
        }else if (obj instanceof ControllerPJuridica){
            ControllerPJuridica cpj = (ControllerPJuridica)obj;

            for (PessoaJuridica pj : cpj.read()) {
                System.out.println(pj);
            }
        }
        System.out.println("_______________________Obrigado ______________________");
    }
}
