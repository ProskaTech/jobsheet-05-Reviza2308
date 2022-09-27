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


public class latihan5 {
    public static void main(String[] args) {
        String name ="", hoby="";
        
        name = JOptionPane.showInputDialog("Nama Anda : ");
        hoby = JOptionPane.showInputDialog("Hobi Anda : ");
        
        String msg = "Jadi hobi anda "+hoby+". "
                + "hobi yang bagus "+name;
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println("Jadi hobi anda "+hoby+". hobi yang bagus "+name);
        
    }

}
