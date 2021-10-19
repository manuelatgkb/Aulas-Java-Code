package modulo4.Aula23;


public class Dados {
    int posicao = 0;
    Object[] dados = new Object[4];

    public String add(Object obj){
        String mensagem;
        if(posicao < dados.length){
        dados[posicao] = obj;
        posicao++;
        mensagem = "Salvo com sucesso";
        }else{
            Object[] dados2 = new Object[dados.length*2];
    }
    return mensagem;
}
}
