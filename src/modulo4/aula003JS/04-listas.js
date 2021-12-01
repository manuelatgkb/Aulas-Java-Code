const lista = ["Inez", "Jojo", "Guga"]
const lista2 = new Array("Inex", "Jojo", "guga");

console.log(lista);
console.log(lista2);

lista.push("Chimbinha");
// lista = []; uma lsita const permite adicao de itens numa lista mas nao permite alteracao dos valores da lista.
console.log(lista);
console.log(lista.length);
console.log("Index da JOJO", lista.indexOf("Jojo"));

const valor = lista.pop();
console.log(valor);
console.log(lista);

const novaLista = lista.slice(1,2);
console.log(novaLista);

lista.splice(1,1);
console.log(lista);



