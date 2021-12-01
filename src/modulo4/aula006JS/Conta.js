export class conta{
    agencia;
    numero;
    _saldo;
    cliente;
 
get Agencia(){
    return this.agencia;
}

set agencia(ag){
    this.agencia = ag;
}

depositar(valor){
    this._saldo +=valor;
}

saque(valor){
    if(this.saldo > valor){
    this._saldo -=valor;
    }
    return "saldo insuficiente";
    }

}