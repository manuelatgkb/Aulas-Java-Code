//var livrosClassicos= [];
//var livroBarrocos=[];
//var livrosNeoclassicos
//var livrosContemporaneos =[];



window.onload = function(){
    console.log('Carregando o Java Script')
    let livros = [];
    localStorage.setItem("livro", JSON.stringify(livros));
}

function salvar(event){
    event.preventDefault();
    console.log('Salvando dados');
    let id = document.getElementById('id');
    let nome = document.getElementById('nome');
    let autor = document.getElementById('autor');
    let ano = document.getElementById('ano');
    console.log(nome.value, autor.value, ano.value, id.value);
        livro = {"nome": nome.value, "autor": autor.value, "ano": ano.value, "id":id.value};
            let livros = JSON.parse(localStorage.getItem("livro"));
            livros.push(livro);
            localStorage.setItem("livro", JSON.stringify(livros));
        

    //ano.push(ano.value);

    /*criando um dicionário, "chave" : valor.
    if(ano.value >= 1500 && ano.value <= 1600){
        livro = {"nome": nome.value, "autor": autor.value, "ano": idade.value};
        let livro = JSON.parse(localStorage.getItem("livro"));
        livros.push(livro);
        localStorage.setItem("livro", JSON.stringify(livros));
    }else if(ano.value >= 1600 && ano.value <= 1800){
        livro = {"nome": nome.value, "autor": autor.value, "ano": idade.value};
        let livro = JSON.parse(localStorage.getItem("livro"));
        livroBarrocos.push(livro);
        localStorage.setItem("livro", JSON.stringify(livroBarrocos));
    }else if(ano.value >= 1800 && ano.value <= 1900){
        livro = {"nome": nome.value, "autor": autor.value, "ano": idade.value};
        let livro = JSON.parse(localStorage.getItem("livro"));
        livrosNeoclassicos.push(livro);
        localStorage.setItem("livro", JSON.stringify(livrosNeoclassicos));
    }else{livro = {"nome": nome.value, "autor": autor.value, "ano": idade.value};
        let livro = JSON.parse(localStorage.getItem("livro"));
        livrosContemporaneos.push(livro);
        localStorage.setItem("livro", JSON.stringify(livrosContemporaneos));
    }*/

    
   
   // carregaTabela();

   // console.log(pessoa["nome"]);
    console.log(livrosClassicos);
    console.log(livroBarrocos);
    console.log(livrosNeoclassicos);
    console.log(livrosContemporaneos);
    console.log(livros)
}

function carregaTabela(){
    let livros = JSON.parse(localStorage.getItem("livro"));
    let tbody = document.getElementById('table');
    tbody.innerHTML="";
    livros.forEach(p => {
        tbody.innerHTML += "<tr>"+  "<td>"+p.id +"</td>"  + "<td>"+p.nome +"</td>" + "<td>" + p.autor+" </td>" +"<td>" + p.ano+ "</td>"+ "<tr/>"
    });
}

