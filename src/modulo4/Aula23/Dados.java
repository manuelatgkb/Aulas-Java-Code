package modulo4.Aula23;

public class Dados {
    int posicaoAtual = 0;
    int tamanhoAtual = 4;
    Object[] dados;

    public Dados(){
        this.dados = new Object[tamanhoAtual];
    }

    public String add(Object obj){
        String mensagem;

        if(posicaoAtual < dados.length){
            dados[posicaoAtual] = obj;
            posicaoAtual ++;
        }else{
            tamanhoAtual = tamanhoAtual*2;
            Object[] dados2 = new Object[tamanhoAtual];

            for (int i = 0; i < dados.length; i++) {
                dados2[i] = dados[i];
            }
            dados = dados2;
    }
    mensagem = "Salvo com sucesso";
    return mensagem;
}
}
