import conta from ".model/conta.js"
import ContaRepository from "./repository/ContaRepository.js";

console.log('++++++++++++++++++++++++++Banco+++++++++++++++++++++++');

const conta1 = new conta();
conta1.numero = 123;
conta1.agencia = 8888;
conta1.saldo = 899.99;

console.log(conta1.numero, conta1.agencia, conta1.saldo);

const repository = new ContaRepository
const lista = await repository.findAll();
console.log(lista);

