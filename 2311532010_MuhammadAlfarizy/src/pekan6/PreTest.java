package pekan6;
	import java.util.Scanner;

	public class PreTest {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Input angka awal
		        System.out.print("Masukkan angka awal: ");
		        int angkaAwal = scanner.nextInt();

		        // Input jumlah baris
		        System.out.print("Masukkan jumlah baris: ");
		        int jumlahBaris = scanner.nextInt();

		        // Membuat pola angka berlanjut
		        for (int i = 0; i < jumlahBaris; i++) {
		            for (int j = 0; j <= i; j++) {
		                System.out.print(angkaAwal + " ");
		                angkaAwal++;
		            }
		            System.out.println();
		        }

		        scanner.close();
		    }
		}
