package pekan2;

import java.util.Scanner;

public class OperatorAritmatika {

	public static void main(String[] args) {
		int A1;
		int A2;
		int hasil;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("input angka-1 ");
		A1 = keyboard.nextInt();
		System.out.println("input angka-2");
		A2 = keyboard.nextInt();
		System.out.println();
		keyboard.close();
		System.out.println("operator penjumlahan");
		hasil = A1 + A2; // Penjumlahan
		System.out.println("Hasil = " + hasil);
		System.out.println("operator pengurangan");
		hasil = A1 - A2; //Pembagian
		System.out.println("Hasil = " + hasil);
		System.out.println("operator perkalian");
		hasil = A1 * A2; // Perkalian
		System.out.println("Hasil " + hasil);
		System.out.println("operator pembagian");
		hasil = A1 / A2; // Pembagian
		System.out.println("Hasil " + hasil);
		System.out.println("oprator sisa bagi");
		hasil = A1 % A2; //Sisa Bagi
		System.out.println("Hasil = " + hasil);

	}

}