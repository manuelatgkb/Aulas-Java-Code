function imprimirNome(){
    console.log("Nome qualquer");
}

function imprimirNomeEspecifico(nome){
    console.log("Nome" +nome);
}
function imprimirNomeEspecificoComInterpolacao(nome){
    console.log(`Nome: ${nome}`);
}
function imprimirNomeESobrenome(nome, sobrenome){
    console.log(`Nome: ${nome} \n Sobrenome: ${sobrenome}` );
}

imprimirNome();
imprimirNomeEspecifico('Inex');
imprimirNomeEspecificoComInterpolacao("Jojo");
imprimirNomeESobrenome("Jojo", "Calypso");
