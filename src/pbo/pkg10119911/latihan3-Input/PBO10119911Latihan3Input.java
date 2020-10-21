/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg10119911.latihan3.input;

import java.util.Scanner;
/**
 * 
 * @author 
 * NAMA     : Mochamad Tegar Dwi S
 * KELAS    : IF10K
 * NIM      : 10119911
 * Deskripsi Program : Deklarasi Variabel
 */
public class PBO10119911Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukkan nama Anda ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println(" Nama anda Adalah " +nama);
    }
    
}
