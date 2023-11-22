package pekan6;

import java.util.Scanner;

public class TixToki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input bilangan bulat 
        System.out.print("Masukkan bilangan bulat : ");
        int N = scanner.nextInt();

        // Menampilkan faktor-faktor dari 
        System.out.println("Faktor-faktor dari " + N + " adalah:");
        for (int i = N; i >= 1; i--) {
            if (N % i == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
