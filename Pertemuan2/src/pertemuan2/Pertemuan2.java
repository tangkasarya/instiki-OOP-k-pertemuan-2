/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
/**
 *
 * @author Tangkas
 * TGL : 15-Maret-2025
 */
public class Pertemuan2 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
//         menampilkan tulisan di layar
        String nama = "tangkas arya";
        String nim = "2301010067";
        double IPK = 4.00;
    
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
   
        System.out.println("Input nama mahasiswa :");
        try {
            nama = input.readLine();
        }catch(IOException e) {
            System.out.println("maaf eror bro");
        }
        System.out.println("Input NIM mahasiswa :");
        try {
            nim = input.readLine();
        }catch(IOException e) {
            System.out.println("maaf eror bro");
        }
        System.out.println("Input IPK :");
        try {
            IPK = Double.parseDouble(input.readLine());
        }catch(IOException e) {
            System.out.println("maaf eror bro");
        }
        System.out.printf("Nama saya %s dengan NIM %s dengan IPK %.2f", nama, nim, IPK);
//        System.out.println("Nama mahasiswa :"+nama);
//        System.out.println("NIM mahasiswa :"+nim);
//        System.out.println("IPK :%.2f"+IPK);
        

    }
    
}
