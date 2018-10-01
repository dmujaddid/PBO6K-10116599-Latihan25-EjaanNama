/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Robby Eka Purnama
 * KELAS    : PBO6K
 * NIM      : 10116599
 * Deskripsi Program : Program menampilkan ejaan nama yang inputannya berasal dari user.
 * 
 */
public class PBO6K10116599Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukkan nama depan Anda untuk dieja : ");
        Scanner scan = new Scanner(System.in);
        String nama = scan.next();
        System.out.println();
        System.out.println("Ejaan untuk '" +nama+ "' adalah :");
       
       
        char [] charArray = nama.toCharArray();
        int sz = charArray.length;
        
       for(int x=1; x <= sz; x++) 
            System.out.println("Huruf ke-" +x+ " : ");
        
       for (char c : charArray) {
            System.out.println(c);
 
        }
    }
    
}
