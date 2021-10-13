package modulo3.ExerciciosExtra.R07;

public class Localizacao {
    private long latitude;
    private long longitude;

    public Localizacao(long latitude, long longitude){
        this.latitude = latitude;
        this.longitude = longitude;

    }

    
    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }
    public long getLatitude() {
        return latitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }
    public long getLongitude() {
        return longitude;
    }

    @Override
    public String toString(){
        String retorno = this.getLatitude() + " - "+ this.getLongitude();
        return retorno;
    }
}
