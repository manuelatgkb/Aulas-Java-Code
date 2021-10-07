package modulo3.aula16.P3;

public class Tela {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.setNome("Maykon");
        p1.setSobrenome("Granemann");

        String nome = p1.getNome();
        String sobrenome = p1.getSobrenome();
    }
}
