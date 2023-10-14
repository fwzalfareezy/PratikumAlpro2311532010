package pekan3;

import java.util.Scanner;

public class BilanganGenapGanjil {
    public static void main(String[] args) {
    	System.out.println("Tugas Bilangan Ganjil Genap berdasarkan Nomor NIM \n Oleh Muhammad Alfarizy\n\n");
    	Scanner input =new Scanner(System.in);
    	System.out.print("Masukkan NIM Anda:\n ");
        long nim = input.nextLong();
        input.close();
        if(nim % 2 == 0)
        {
            System.out.println("NIM anda adalah angka genap!");
        }
        else 
        {
            System.out.println("NIM anda adalah angka ganjil!");
        }
        
        
    }
}
