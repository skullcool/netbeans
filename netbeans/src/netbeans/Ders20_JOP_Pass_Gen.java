
package ders20;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ders20 {
    
    public static void main(String[] args) {
     String a=   JOptionPane.showInputDialog("Şifrenin Uzunluğu Giriniz");
    
      char[] names= new char[Integer.parseInt(a)];
      Random rd = new Random();
        for (int i = 0; i < names.length; i++) {
            int x = rd.nextInt(93)+33;
            names[i]= (char)x;
        }
      
       String pass= "";
        for (int i = 0; i < names.length; i++) {
            pass += names[i];
            
        }
      
      JOptionPane.showMessageDialog(null, pass);
       
    }
    
}
