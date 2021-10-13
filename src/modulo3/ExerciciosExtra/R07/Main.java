package modulo3.ExerciciosExtra.R07;

public class Main {
    public static void main(String[] args) {
        Localizacao loc1 = new Localizacao(28282828, 16161545);
        long lat = loc1.getLatitude();
        long log = loc1.getLongitude();
        System.out.printf("\nLat inicial %d log inicial %d\n", lat, log);

        loc1.setLatitude(49493728);
        loc1.setLongitude(-26262828);
        System.out.println(loc1);
    }
}
