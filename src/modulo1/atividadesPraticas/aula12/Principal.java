package modulo1.atividadesPraticas.aula12;

int numeroSaques;
 

public class Principal {
    public static void main(String[] args) {
        Calculadora calc1 = new Calculadora();

        calc1.transferencias(100, 0.001);
        calc1.taxadesaque(1.30, 5);
    }
}
