//Crie um pasta para a esta atividade e coloque nela todos os arquivos criados durante esta atividade.
// Execute o comando npm init, para criar um novo módulo js.
// Crie as classes Pessoa, Pessoa Física e Pessoa Jurídica. Cada classe de estar em um arquivo separado. As classe Pessoa deve ser a super classe das demais.
// Todos os atributos das classes devem ser privados e apenas acessíveis via métodos do tipo get e set.
// A Pessoa Física deve receber no construtor o CPF e a Pessoa Jurídica o CNPJ.
// Crie um arquivo para realizar os testes. Crie uma instância de objeto para cada classe, realize as atribuições utilizando os métodos e imprima os objetos no terminal.
// Adicione os arquivos da atividade em um repositório GIT. Envie as alterações para
import { pessoa } from "./pessoa";

export class pessoaJuridica extends pessoa{
    #cnpj
    constructor(cnpj){
        this.#cnpj= cnpj;
    }
}