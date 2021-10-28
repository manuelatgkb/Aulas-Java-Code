var pessoas= [];

window.onload = function(){
    console.log('Carregando JS')
    carregaTabela();
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

function carregaTabela(){
    let tbody = document.getElementById("corpo-tabela");
    tbody.innerHTML= "";
    pessoas.forEach(p => {
        tbody.innerHTML += "<tr>"+ + "<td>"+p["nome"] +"</td>" + "<td>" + p["sobrenome"]+" </td>" +"<td>" + p["idade"]+ "</td>"+ "<tr/>"
    });
}