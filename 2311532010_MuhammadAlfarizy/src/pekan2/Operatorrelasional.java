package pekan2;

import java.util.Scanner;

public class Operatorrelasional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A1;
		int A2;
		boolean hasil;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input amhgka -1; ");
		A1 = keyboard.nextInt();
		System.out.println("Input angka-2: ");
		A2 = keyboard.nextInt(); 
		keyboard.close();
		hasil = A1>A2; // apakah A1 lebih besar dari A2
		System.out.println("A1 > A2= " + hasil);
		hasil = A1<A2; // apakah A1 lebih kecil A2
		System.out.println("A1 < A2= " + hasil);
		hasil = A1>=A2; // apakah A1 lebih besar dari A2
		System.out.println("A1 >= A2= " + hasil);
		hasil = A1<=A2; // apakah A1 lebih kecil dari A2
		System.out.println("A1 <= A2= " + hasil);
	}

}
