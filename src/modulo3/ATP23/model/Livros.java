package modulo3.ATP23.model;

public class Livros {
    public int id; 
    public int isbn;
    public String editora;
    public int dataPublicao;
    public String cidade;
    public String autor;
    public String titulo;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    @Override
    public boolean equals(Object obj){
        Livros outro = (Livros)obj;
        if(this.id == outro.id){
            return true;
        }else{
            return false;
        }
    }
}
