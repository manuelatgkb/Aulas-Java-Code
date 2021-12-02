export class produto{
    marca;
    Id;
    quantidade;
    nome;

 
    get produto(){
        return this.produto;
    }

    set produto(p){
        this.produto = p;
    }

    estoque(quantidade){
        this.quantidade += quantidade;
    }

    vendas(quantidade){
        if(this.produto > quantidade){
        this.quantidade -=quantidade;
        }
        return "produto indisponível";
        }

}