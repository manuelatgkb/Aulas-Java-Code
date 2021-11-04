import modulo4.Aula32.controller.PessoaController;

public class PessoaView{
    public static void main(String[] args) {
        
        PessoaController pc = new PessoaController();
        Pessoa p1 = new Pessoa();
        p1.id = 1;
        p1.nome = "Lala";
        p1.sobrenome = "Brasil";

        pc.create(p1);

        for (Pessoa p: pc.read()) {
            System.out.println(p);
        }
        pc.delete(p1);
    }
}