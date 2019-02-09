
package ders16;

import java.io.IOException;
import java.util.Scanner;

public class Ders16 {

    // metodlar
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
        System.out.println("User Name:");
        String x = sc.nextLine();
        if (userCheckOne(x)) {
            System.out.println("Kullanıcı Adınız doğru");  
        }else{
            System.out.println("Kullanıcı Adınız yanlış");  
       
        }
 
      
    }
    
    public static boolean userCheckOne(String username){
        boolean snc =false;
        if (username.equals("safak")) {
            snc=true;
        }
        return snc;
    }
    
    public static boolean userCheckTwo(String username){
        
        if (username.equals("safak")) {
          return true;
        }else{
            return false;
        }
       
    }
    
   
    
    
}
