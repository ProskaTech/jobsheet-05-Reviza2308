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

import javax.swing.JOptionPane;


public class tugas2 {
    public static void main(String[] args) {
        String word1 = "", word2="" , word3="";
        
        word1 = JOptionPane.showInputDialog("Enter Word 1 ! ");
        word2 = JOptionPane.showInputDialog("Enter Word 2 !");
        word3 = JOptionPane.showInputDialog("Enter Word 3 !");
        
        String pesan = word1 +" "+word2 +" "+word3;
        
        JOptionPane.showMessageDialog(null, pesan);
        System.out.println(word1 +" "+word2 +" "+word3);
    }
}
