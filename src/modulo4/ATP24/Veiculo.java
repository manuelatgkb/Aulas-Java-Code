package modulo4.ATP24;


public class Veiculo {
    public String marca;
    public String modelo;
    public String placa;

    @Override
    public String toString(){
        return this.marca + " , " + this.modelo + ", " + this.placa;
    }
}
