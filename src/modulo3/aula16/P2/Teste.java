package modulo3.aula16.P2;

public class Teste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Maykon", "Granemann", 18);

        String nome = p.getNome();
        String sobrenome = p.getSobrenome();
        int idade = p.getIdade();

        System.out.printf(p.getNome());
        System.out.printf(p.getSobrenome());
        System.out.println(p.getIdade());
    }
}
