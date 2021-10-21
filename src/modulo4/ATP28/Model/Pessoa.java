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
    public boolean equals(Object obj) {
        if(obj instanceof PessoaFisica){
            PessoaFisica outro = (PessoaFisica)obj;
            if(this.id == outro.id){
                return true;
            }
        }
            return false;
    }


    @Override
    public String toString() {
        String retorno = Integer.toString(id);
        return retorno;
    }
}
