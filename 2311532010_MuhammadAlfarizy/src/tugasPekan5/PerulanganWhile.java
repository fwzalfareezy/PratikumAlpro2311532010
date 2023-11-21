package tugasPekan5;

import java.util.Scanner;

public class PerulanganWhile {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan bilangan bulat positif (masukkan bilangan bulat negatif untuk berhenti):");

        int sum = 0;
        int number = scanner.nextInt();

        while (number >= 0) {
            sum += number;
            System.out.println("Total sementara: " + sum);
            System.out.println("Masukkan bilangan bulat positif (masukkan bilangan bulat negatif untuk berhenti):");
            number = scanner.nextInt();
        }

        System.out.println("Jumlah bilangan bulat positif: " + sum);
        System.out.println("Program berhenti karena bilangan negatif dimasukkan.");
        
        scanner.close();
    }
}