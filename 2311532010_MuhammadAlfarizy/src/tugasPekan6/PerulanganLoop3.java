package tugasPekan6;

public class PerulanganLoop3 {
    public static void main(String[] args) {
        int n = 3; // bole ganti nilai sesuka hati
        printPattern(n);
    }

    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((i + j) % 2 == 0 ? "_ " : " ");
            }
            System.out.println();
        }
    }
}
