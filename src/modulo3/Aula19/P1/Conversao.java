package modulo3.Aula19.P1;

public class Conversao {
    public static void main(String[] args) {
        int n = 10;
        long nLong = n;
        int n2 = (int)nLong;

        Filme f12 = new Filme();
        f12.titulo = "T1";
        f12.anoLancamento = 2021;
        f12.genero = "g1";

        Object obj = f12;
        Filme f14 = (Filme)obj;

        System.out.println(f12);
        System.out.println(f14);

    }
}
