package modulo4.Aula25.View;

import modulo4.Aula25.Models.Endereco;
import modulo4.Aula25.Models.Pessoa;
import modulo4.Aula25.Models.PessoaFisica;
import modulo4.Aula25.Models.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();
        pf.id = 10;
        pf.nome = "Inex";
        do{
            Endereco end1 = new Endereco();
            end1.enderecoResidencial.logradouro = "Av Brasil";
            end.enderecoResidencial.numero = "55";
            end1.enderecoResidencial.complemento = "Apto 406b";
            end1.enderecoResidencial.cep = "30140-130";
            end1..enderecoResidencial.cidade = "Belo Horizonte";
            end1.enderecoResidencial.estado = "Minas Gerais";
            end1.enderecoResidencial.pais = "Brasil";
            pf.enderecoResidencial = end1;
        }while(true);

        pf.enderecoComercial = end1;

        System.out.println(pf.enderecoResidencial.logradouro);
        System.out.println(pf.enderecoComercial.logradouro);

        end1 = new Endereco();
        System.out.println(end1.logradouro);
        System.out.println(pf.enderecoResidencial.logradouro);
        System.out.println(pf.enderecoComercial.logradouro);

        System.out.println("Alteracoes");
        end1.logradouro = "Av JK";

        System.out.println(pf.enderecoResidencial.logradouro);
    }
}
