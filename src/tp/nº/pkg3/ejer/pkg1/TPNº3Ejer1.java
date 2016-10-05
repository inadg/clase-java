/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.nº.pkg3.ejer.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Puesto 2.1
 */
public class TPNº3Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        
        
        String cadenaa;
        String cadenab;
        String cadenac;
        
        cadenaa = JOptionPane.showInputDialog(null, "Ingrese el valor del lado a");
        cadenab = JOptionPane.showInputDialog(null, "Ingrese el valor del lado b");
        cadenac = JOptionPane.showInputDialog(null, "ingrese el valor del lado c");
        
        a = Integer.parseInt(cadenaa);
        b = Integer.parseInt(cadenab);
        c = Integer.parseInt(cadenac);
        
        
        if (a == 90 || b == 90 || c == 90) {
            JOptionPane.showMessageDialog(null, "Es un triangulo rectangulo");

        } else {
            JOptionPane.showMessageDialog(null, "No es un triangulo rectangulo");
        }
        
                
        
        
    }
    
}
