package ba.unsa.etf.rpr;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int n;
        System.out.println("Unesite prirodan broj: ");
        Scanner ulaz = new Scanner(System.in);
        n = ulaz.nextInt();
        for (int i = 1; i <= n; i++) {
            int suma = 0;
            int pom = i;
            do {
                suma += pom % 10;
                pom /= 10;
            } while (pom != 0);
            if(i%suma==0) System.out.println(i);
        }
    }
}
