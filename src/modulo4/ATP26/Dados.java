package modulo4.ATP26;

public class Dados {
    //Crie uma classe Dados com um atributo privado do tipo array de Object.
    Object[] dados;
    int posicaoAtual = 0;
    int tamanhoAtual = 5;

    public Dados(){
    this.dados = new Object[tamanhoAtual];
    }

    public int size(){
        return posicaoAtual + 1;
    }

    public String add(Object obj){
        String mensagem;
        if(posicaoAtual < dados.length){
            dados[posicaoAtual] = obj;
            posicaoAtual ++;
        }else{
            tamanhoAtual = tamanhoAtual + 5;
            Object[] dados2 = new Object[tamanhoAtual];

            for (int i = 0; i < dados.length; i++) {
                dados2[i] = dados[i];
            }
            dados = dados2;
        }
    mensagem = "Salvo com sucesso";
    return mensagem;
    }

    public String remove(Object obj){
        for (int i = 0; i < dados.length; i++) {
            if( dados[i].equals(obj)){
                reorganiza(i);
                posicaoAtual --;
                return "removido com sucesso";
            }
        }
        return "Não encontrado";
    }

    public void reorganiza(int posicao){
        for (int i = posicao; i < dados.length; i++) {
            this.dados[i] = this.dados[i+1];
        }

    public int qtdElementos(){
        return dados.length;
    }
}
