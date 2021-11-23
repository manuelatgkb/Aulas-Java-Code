package src.modulo4.aula43.model;

public class Categoria {
    private String nome;
    private String descricao;

    public Categoria(String nome){
        this.nome = nome;
    }

    public Categoria(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setDescricao(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return nome;
    }

    @Override
    public String toString() {
        String retorno = String.format("%d - %s - %s\n ", this.id, this.nome, this.descricao);
        return retorno;
    }
}
