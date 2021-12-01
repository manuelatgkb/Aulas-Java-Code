// Crie um arquivo js e nele Crie duas classes, uma classe de para Pessoa e outra para Cliente. 
//Crie um objeto de cada classe e imprima seus valores.
import { inicio } from "./inicio.js"
import { calculadora } from "./calculadora.js";

const p = new Pessoa(10);
p.nome = 'Maykon';
p.nacionalidade = 'Brasileiro';
console.log(p);


const cliente = new Cliente(10);
cliente.numero = 345;
cliente.depositar(200);
console.log(cliente);