    
import { ContaCorrente } from "./ContaCorrente"
import { ContaPoupanca } from "./ContaPoupanca";

const cc1 = new ContaCorrente(10);
cc1.agencia = 1345;
cc1.numero = 25677;
cc1._saldo = 500;
cc1.cliente = 'Maykon';

const cp1 = new ContaPoupanca();
cp1.numero = 345;
cp1.depositar(200);
console.log(cp1);