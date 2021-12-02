import Cliente from ".model/Cliente.js"
import ClienteRepository from "./repository/ClienteRepository.js";

console.log('++++++++++++++++++++++++++Banco+++++++++++++++++++++++');

const cliente1 = new Cliente();
cliente1.nome = "Maykon";
cliente1.sobrenome= "Granemann";
cliente1.cpf= "123456789";
console.log(cliente1.nome, cliente1.sobrenome, cliente1.cpf);

const repository = new ContaRepository
const lista = await repository.findAll();
console.log(lista);
