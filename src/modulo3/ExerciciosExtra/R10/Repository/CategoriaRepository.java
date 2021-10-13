package modulo3.ExerciciosExtra.R10.Repository;

import java.util.ArrayList;

import modulo3.ExerciciosExtra.R10.Domain.Categoria;

public class CategoriaRepository {
    private ArrayList<Categoria> categorias;

    public CategoriaRepository(){
        this.categorias = new ArrayList<Categoria>();
    }

    //CRUD
    //create - salvar
    public void create(Categoria categoria){
        this.categorias.add(categoria);
        System.out.println(categoria);
    }

    //read - ler
    public ArrayList<Categoria> read(){
        return this.categorias;
    }

    //alterar - up date
    public void update(Categoria categoria){
        for ( Categoria c : this.categorias) {
            if(c.getId()==categoria.getId()){
                this.delete(c);
                this.create(categoria);
            }
        }
    }
    //excluir - delete
    public void delete(Categoria categoria){
        this.categorias.remove(categoria);
    }
}
