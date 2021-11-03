function sobre(){
    console.log("Sobre nós")
    let frame = document.getElementById("frame");
    frame.src = "sobre.html"

}

function servicos(){
    console.log("Serviços")
    let frame = document.getElementById("frame");
    frame.src = "servicos.html"
}

function contato(){
    console.log("Contato")
    let frame = document.getElementById("frame");
    frame.src = "contato.html"
}
function home(){
    console.log("Home")
    let frame = document.getElementById("frame");
    frame.src = "home.html"
}

window.onload= function(){
    home();
}
