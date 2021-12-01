//Crie um arquivo para criação de uma calculadora. 
//Adicione 4 métodos para realizar as 4 operações básicas da matemática. 
//Realize a chamada dos 4 métodos e imprima seus resultados.

export class calculadora{
    _saldo;
    valor;


    soma(valor){
        this._saldo +=valor;
    }

    subtracao(valor){
        this._saldo -=valor;
    }

    multiplicacao(valor){
        this._saldo *valor;
    }

    divisao(valor){
        this._saldo /valor;
    }
}


