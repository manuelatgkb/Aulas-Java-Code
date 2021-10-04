package modulo3.aula12;

public class TelaPrincipal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.setNome("Maykon");
        String n = p1.getNome();
        System.out.println(p1.getNome());

        p1.setSobrenome("Dyego");
        String s = p1.getSobrenome();
        System.out.println(s);

        p1.setIdade(35);
        int i = p1.getIdade();
        System.out.println(i);

        p1.setCpf("26255555555");
        String c = p1.getCpf();
        System.out.println(c);
    } 
}
