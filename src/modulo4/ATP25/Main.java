package modulo4.ATP25;

public class Main {
    public static void main(String[] args) {
        Computador comp1 = new Computador();
        comp1.marca = "Dell";
        comp1.discoRigido = "blablá";
        comp1.processador = "patati";
        comp1.memoriaRam = "100gb";

        Notebook note1 = new Notebook();
        note1.bateria = "12 horas";
        note1.bluetooh= "sim";
        note1.discoRigido = "1TB";
        note1.marca = "Apple"; 
        note1.processador = "8";
        note1.velWifi = "sim";

        Desktop dtop1 = new Desktop();
        dtop1.marca = "Desk";
        dtop1.discoRigido = "1TB";
        dtop1.processador = "Intell";
        dtop1.memoriaRam = "4TB";
        dtop1.fonte = "220/110";
        dtop1.monitor = "11polegadas";
        dtop1.tamGabinete = "Patati";

        Object obj1 = comp1;
        Object obj2 = note1;
        Object obj3 = dtop1;
    }
}
