/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paintingproject;

import javax.swing.JFrame;

/**
 *
 * @author salma
 */
public class PaintingProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         JFrame frm= new JFrame();
        frm.setTitle("Moving String using Keys");
        Paintpanel pn= new Paintpanel();  
        frm.setContentPane(pn);
        frm.setSize(800, 700);
        frm.setVisible(true);     }
    
}
