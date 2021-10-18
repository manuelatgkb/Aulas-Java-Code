package modulo4.ATP25;

public class Computador {
    public String marca; 
    public String processador; 
    public String discoRigido; 
    public String memoriaRam; 

    @Override
        public String toString(){
            return this.marca + ", " + this.processador + "," + this.discoRigido + "," + this.memoriaRam;
        }
}
