var pessoas= [];

window.onload = function(){
    console.log('Carregando JS')
    //carregaTabela();
    let pessoa = [];
    localStorage.setItem("pessoa", JSON.stringify(pessoa));

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
        let pessoas = JSON.parse(localStorage.getItem("pessoa"));
        pessoas.push(pessoa);
        localStorage.setItem("pessoa", JSON.stringify(pessoas));


        //localStorage.setItem("pessoa", JSON.stringify(pessoa));
    }else{
        alert('Sai fora de menor')
    }
    carregaTabela();
    
   // console.log(pessoa["nome"]);
    console.log(pessoas);
}

function carregaTabela(){
    let tbody = document.getElementById("corpo-tabela");
    tbody.innerHTML= "";
    console.log(localStorage.getItem("pessoa"));
    //pessoas.forEach(p => {
       // tbody.innerHTML += "<tr>"+ + "<td>"+p["nome"] +"</td>" + "<td>" + p["sobrenome"]+" </td>" +"<td>" + p["idade"]+ "</td>"+ "<tr/>"
   // });
}