package modulo4.ATP25;

public class Desktop extends Computador{
    public String tamGabinete;
    public String monitor;
    public String fonte;

    @Override
    public String toString(){
        return this.tamGabinete + "," + this.monitor + "," + this.fonte;
    }
}