package modulo4.ATP25;

public class Notebook extends Computador{
    public String bateria;
    public String velWifi;
    public String bluetooh;

    @Override 
        public String toString(){
        return this.bateria + "," + this.velWifi + "," + this.bluetooh; 
    }
}