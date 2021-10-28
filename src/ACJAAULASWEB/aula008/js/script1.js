var pessoas= [];

window.onload = function(){
    console.log('Carregando JS')
}

function salvar(event){
    event.preventDefault();
    console.log('Salvando dados');
    let nome = document.getElementById('nome');
    let sobrenome = document.getElementById('sobrenome');
    let idade = document.getElementById('idade');
    //console.log(nome.value, sobrenome.value, idade.value);

    //idades.push(idade.value);

    //criando um dicionário, "chave" : valor.
    if(idade.value >= 18){
        pessoa = {"nome": nome.value, "sobrenome": sobrenome.value, "idade": idade.value};
        pessoas.push(pessoa);
    }else{
        alert('Sai fora de menor')
    }
    
   // console.log(pessoa["nome"]);
    console.log(pessoas);
}