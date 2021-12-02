class conta{
    numero;
    agencia;
    saldo;
    id;
    construtor(numero, agencia, saldo, id=null){
        this.numero = numero;
        this.id=id;
        this.agencia = agencia;
        this.saldo = saldo;

    }
}

    export default conta
   /* get numero(){
        return this.#numero
    }
    set numero(numero){
        this.#numero= numero
    }

    get agencia(){
        return this.#agencia
    }
    set agencia(numero){
        this.#agencia= agencia
    }

    get saldo(){
        return this.#nsaldo
    }
    set saldo(saldo){
        this.#saldo= saldo
    }

    get id(){
        return this.#id
    }
        set id(id){
            this.#id= id
        }

}*/
