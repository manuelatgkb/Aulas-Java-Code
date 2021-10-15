package modulo3.Aula21;

public class Main {
    public static void main(String[] args) {
        Mae mae = new Mae();
        Filha filha = new Filha();
        Neta neta = new Neta();
        
        //A Filha tem tudo o que tem na Mae e mais alguns dados.
        Mae mae2 = new Filha(); //id nome

        //A Mae tem menos dados que a Filha, assim a Filha é "maior" que a Mae.
        //Filha filha2 = new Mae();

        //A Mae consegue receber a Filha, mas ela descarta ou esconde os dados suplementares da mae.
        Mae mae3 = filha;
        Mae mae4 = new Neta();
        Filha filha2 = new Neta();
        // a mae3 foi gerada através da filha, por isso ela imprimi filha ao invés de mãe.
        mae3.Falar();

       // mae.Falar();
       // filha.Falar();
       // neta.Falar();
    }
}
