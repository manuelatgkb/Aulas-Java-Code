package modulo3.ATP22.P2;

public class TelaBanco {
   public static void main(String[] args) {
       //
       ContaCorrente cc = new ContaCorrente(9000.99, 39393939.939);  
    //realize um saque e um depósito  
       cc.saque(10);
       cc.deposito(600);

       ///imprima
       System.out.println(cc);

   } 
}
