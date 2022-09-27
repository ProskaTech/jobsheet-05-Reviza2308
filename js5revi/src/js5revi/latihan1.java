/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 Created by 21343031_Muhammad Reviza Dekry
*/
package js5revi;

/**
 *
 * @author Revskyyy
 */

import java.util.Scanner;
public class latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan nama lengkap: ");
        String nama = in.nextLine();
        
        System.out.println("Masukan NIM: ");
        int NIM = in.nextInt();
        
        System.out.println("Masukan Nilai: ");
        float nilai = in.nextFloat();
        
        System.out.println("\nNama : "+nama +
                           "\nNIM : "+NIM +
                           "\nNilai : "+nilai);
    }
    
}
