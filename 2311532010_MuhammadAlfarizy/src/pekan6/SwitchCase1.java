package pekan6;

import java.util.Scanner;

public class SwitchCase1 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Nama: ");
			String nama=in.nextLine();
			System.out.println("Umur");
			int umur = in.nextInt();
			System.out.print("Masukkan Pilihan Anda 1 sampai 3");
			int n=in.nextInt();
			System.out.println("Nama: " + nama);
			System.out.println("Umur: " + umur);
			System.out.println("Pilihan: " + n);
			switch (n) {
			case 1:
				System.out.println("Anda Memilih Anies");
				break;
			case 2:
				System.out.println("Anda Memilih Prabowo");
				break;
			case 3:
				System.out.println("Anda Memilih Ganjar");
				break;
			default:
				System.out.println("Pilihan Anda Bukan Nomor 1 sampai 3");
				
			}
		}
		System.out.println("Terima Kasih Sudah Memilih");
	}

}
