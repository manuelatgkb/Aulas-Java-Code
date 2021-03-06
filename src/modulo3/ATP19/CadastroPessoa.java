package modulo3.ATP19;

import java.util.Scanner;

/*
Nesta classe, crie um array de Pessoa com 5 posições.
_ Crie 5 objetos da classe pessoa, chame os método set para atribuir valores diferente para cada pessoa e salve cada objeto em uma posição do array.
_ Imprima todos os dados das 5 pessoas utilizando o laço de repetição foreach.


*/

public class CadastroPessoa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        PessoaFisica[] arrayPessoas = new PessoaFisica[5];

        for (int i = 0; i < arrayPessoas.length; i++) {

            PessoaFisica pessoa = new PessoaFisica();

            System.out.printf("------------ %dº Pessoa -------------\n", i+1);
            System.out.print("Digite o nome: ");
            pessoa.setNome(sc.nextLine());

            System.out.print("Digite o sobrenome: ");
            pessoa.setSobrenome(sc.nextLine());

            System.out.print("Digite a idade: ");
            pessoa.setIdade(Integer.parseInt(sc.nextLine()));

            System.out.print("Digite o RG: ");
            pessoa.setRg(sc.nextLine());

            //System.out.print("Digite o CPF: ");
           // pessoa.setCpf(sc.nextLine());

            arrayPessoas[i] = pessoa;
        }


        for (PessoaFisica pessoaFisica : arrayPessoas) {
            System.out.println("---------------------------------");
            System.out.println("Nome: " + pessoaFisica.getNome());
            System.out.println("Sobrenome: " + pessoaFisica.getSobrenome());
            System.out.println("Idade: " + pessoaFisica.getIdade());
            System.out.println("RG: " + pessoaFisica.getRg());
            //System.out.println("CPF: " + pessoaFisica.getCpf());
        }
    }
}
