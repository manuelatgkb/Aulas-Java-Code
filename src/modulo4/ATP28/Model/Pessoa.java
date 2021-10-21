package modulo4.ATP28.Model;

public class Pessoa {
    public int id; 
    public Endereco enderecoRes;
    public Endereco enderecoCom;


    public Pessoa(){
    enderecoRes = new Endereco();
    enderecoCom = new Endereco();
    }


    @Override
    public String toString() {
        String retorno = Integer.toString(id);
        return retorno;
    }
}
