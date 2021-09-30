package modulo1.Revisao;

public class a6booleanSimples {
    public static void main(String[] args) {
        boolean executa = false;

        if(executa){
            System.out.println("Entrou no if");
        }

        boolean verdade = true;
        if(!verdade){
            System.out.println("Entrou no segundo if");
        }
        if(!verdade || executa){
            System.out.println("Entrou no terceiro if");
        }
        if(verdade && !executa){
            System.out.println("Entrou no quarto if");
        }
        boolean resultado = verdade && !executa;
    }
}

