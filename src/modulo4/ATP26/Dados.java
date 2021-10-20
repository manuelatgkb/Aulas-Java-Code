package modulo4.ATP26;

public class Dados {
    //Crie uma classe Dados com um atributo privado do tipo array de Object.
    private Object[] dados;
    int posicaoAtual;
    int tamanhoAtual = 5;

    public Dados(){
        this.dados = new Object[tamanhoAtual];
    }

    public void size(){
        System.out.println("O tamanho da lista é : " + posicaoAtual);
    }

    public String add(Object obj){
        String mensagem;
        if(posicaoAtual < this.dados.length){
            this.dados[posicaoAtual] = obj;
            posicaoAtual ++;
        }
        else{
            tamanhoAtual = this.dados.length + 5;
            Object[] dados2 = new Object[tamanhoAtual];

            for (int i = 0; i < dados.length; i++) {
                dados2[i] = dados[i];
            }
            dados = dados2;
            
            this.dados[posicaoAtual] = obj;
            posicaoAtual++;
        }
    mensagem = "Salvo com sucesso";
    return mensagem;
    }

    public String remove(Object obj){
        int indice = buscar(obj);
        for (int i = 0; i < dados.length; i++) {
            if(indice >=0 ){
                reorganiza(indice);
            }
            
        }
        return "Não encontrado";
    }

    public boolean contains(Object obj){
        int indice = buscar(obj);
        if(indice >= 0){
            return true;
        }
        return false;
    }

    private int buscar(Object obj){
        for (int i = 0; i < dados.length; i++) {
            if(obj.equals(dados[i])){
                return i;
            }
        }return -1;
    }

    public void reorganiza(int posicao){
        for (int i = posicao; i < dados.length -1; i++) {
            dados[i] = dados[i+1];
        }
        posicaoAtual--;
    }

    public int qtdElementos(){
        return dados.length;
    }
}
