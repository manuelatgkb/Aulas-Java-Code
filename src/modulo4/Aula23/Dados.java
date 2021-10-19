package modulo4.Aula23;


public class Dados {
    int posicao = 0;
    Object[] dados = new Object[10];

    public void add(Object obj){
        dados[posicao] = obj;
        posicao++;
    }
}
