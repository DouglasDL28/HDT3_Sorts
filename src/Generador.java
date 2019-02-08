import java.util.Random;
//Douglas y Andres
public class Generador {
    public static void main(String[] args) {
        int[] ndigitos = new int[10001];
        int n;
        Random rnd = new Random();
        for (int i = 0; i < 5001; i++) {
            ndigitos[i] = 0;
        }
        for (long i = 0; i < 900000L; i++) {
            n = (int) (rnd.nextDouble() * 3500.0);
            ndigitos[n]++;
        }
        for (int i = 0; i < 3001; i++) {
            System.out.println(ndigitos[i]);
        }

    }
}
