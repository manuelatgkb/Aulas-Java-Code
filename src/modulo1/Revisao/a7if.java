package modulo1.Revisao;

public class a7if {
    public static void main(String[] args) {
        byte idade = 17;

        if(idade >= 18){
            System.out.println("Pode consumir alcool");
        }
        if(idade > 18 || idade == 18){
            System.out.println("Pode consumir alcool");
        }
        if(idade < 18){
            System.out.println("Pode consumir coca cola");
        }
    }
}
