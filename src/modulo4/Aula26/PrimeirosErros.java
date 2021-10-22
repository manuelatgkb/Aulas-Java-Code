package modulo4.Aula26;

public class PrimeirosErros {
    public static void main(String[] args) {
        String nome = null;
        //nome.lentgth(); // NullPointer Exception
        int idade = Integer.parseInt("-10");

        if(idade <= 0 || idade > 150){
            throw new IllegalArgumentException("Idade Invalida");
        }
    }
}
