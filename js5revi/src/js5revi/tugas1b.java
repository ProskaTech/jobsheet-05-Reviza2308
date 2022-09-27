/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 Created by 21343031_Muhammad Reviza Dekry
*/
package js5revi;

/**
 *
 * @author Revskyyy
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class tugas1b {
     public static void main(String[] args) {
        BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
        String word1 = "", word2 ="", word3 ="";
        
        try {
            System.out.println("Enter Word 1 =");
            word1 = in.readLine();
            System.out.println("Enter Word 2 =");
            word2 = in.readLine();
            System.out.println("Enter Word 3 =");
            word3 = in.readLine();
        }
        catch (IOException e){
            System.out.println("ERROR!! gagal membaca keyboard");
        }
        System.out.println("\n"+word1 +" "+word2+" "+word3);
    }
}
