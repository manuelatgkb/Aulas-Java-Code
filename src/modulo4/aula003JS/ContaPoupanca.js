export class ContaPoupanca{
    numero;
    saldo;
    agencia;
    cliente;

depositar(valor){
    this.saldo +=valor;
}

saque(valor){
    if(this.saldo > valor){
    this.saldo -=valor;
    }
    return "saldo insuficiente";
    }

}

const cp1 = new ContaPoupanca();
    
cp1.numero = '123456';
cp1.saldo = 531.12;
cp1.agencia = '002-9';
cp1.cliente = 'Maykon';
cp1.log(conta1);
cp1.log(conta1.numero);


cp1.saque(30);
cp1.depositar(50);