lista = new Array(0,5,8,9,48);

for(let cont = 0; cont<lista.length; cont++){
    console.log(lista[cont]);
}

//Elemento específico

//console.log(lista[0]);

lista.forEach(function listar(elemento){
    console.log(elemento);
});

function listar(elemento){
    console.log(elemento);
}

//arrow function 
lista.forEach((elemento) => console.log(elemento));