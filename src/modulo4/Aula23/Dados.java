package modulo4.Aula23;

public class Dados {
    int posicao = 0;
    Object[] dados = new Object[4];

    public String add(Object obj){
        String mensagem;

        if(posicao < dados.length){
            dados[posicao] = obj;
            posicao ++;
        }else{
            Object[] dados2 = new Object[dados.length*2];

            for (int i = 0; i < dados.length; i++) {
                dados2[i] = dados[i];
            }
            dados = dados2;
    }
    mensagem = "Salvo com sucesso";
    return mensagem;
}
}
