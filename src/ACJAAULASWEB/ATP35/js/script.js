function about(){
    console.log("About us")
    let frame = document.getElementById("frame");
    frame.src = "about.html"

}

function services(){
    console.log("what we can do")
    let frame = document.getElementById("frame");
    frame.src = "services.html"
}

function contact(){
    console.log("Contato")
    let frame = document.getElementById("frame");
    frame.src = "contact.html"
}
function home(){
    console.log("Home")
    let frame = document.getElementById("frame");
    frame.src = "home.html"
}

window.onload= function(){
    home();
}
