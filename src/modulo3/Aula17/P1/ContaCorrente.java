package modulo3.Aula17.P1;

public class ContaCorrente extends Conta {

    public ContaCorrente(double saldo, String cliente) {
        super(saldo, cliente);
    }
    @Override
        public String toString(){
            return super.toString() + "," + this.taxa;         
    }
}
