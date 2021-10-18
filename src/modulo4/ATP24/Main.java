package modulo4.ATP24;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo();
        veiculo1.marca = "Ford";
        veiculo1.modelo = "Ka";
        veiculo1.placa = "tgh-8976";

        Carro carro1 = new Carro();
        carro1.portas = 4;
        carro1.capacidade = 200;

        Object obj1 = veiculo1;
        Object obj2 = carro1;

        Veiculo veiculo2 = (Veiculo)obj1;
        Carro carro2 = (Carro)obj2;

        imprimir(veiculo2);
        imprimir(carro2);
    }
    public static void imprimir(Object obj){
        System.out.println(obj);
    }
}
