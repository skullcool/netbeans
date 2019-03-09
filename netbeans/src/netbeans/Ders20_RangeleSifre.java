
package ders20;

import java.util.Random;
import java.util.Scanner;

public class Ders20 {
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Şifrenin Uzunuluğu");
      char[] names= new char[sc.nextInt()];
      Random rd = new Random();
        for (int i = 0; i < names.length; i++) {
            int x = rd.nextInt(93)+33;
            names[i]= (char)x;
        }
      
      
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
            
        }
      
      System.out.println("");
       
    }
    
}
