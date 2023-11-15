package pekan5;
import java.util.Scanner;
	public class while2 {
		public static void main(String[] args) {
			int counter=0; 
			String jawab = "ya"; 
			
			
			Scanner scan = new Scanner(System.in);
			 while (jawab.equalsIgnoreCase("ya")) {
				counter++;
				System.out.println("Jumlah= " + counter);
				System.out.print("Apakah lanjut? (ya/tidak)");
				jawab = scan.next();
				
			}
			System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");
			scan.close();
		}





}