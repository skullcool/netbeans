
package ders16;


public class ders16_1 {
   public static boolean userCheckOne(String user){
       boolean snc = false;
       if (user.equals("test")) {
           snc =true;
       }
       return snc; //true false
   }
   public static boolean userCheckTwo(String user){
       if (user.equals("test")) {
           return true;
       }else{
           return false;
       }
     
   }
    
    public static void main(String[] args) {
        
System.out.println("user="+userCheckOne("testx"));
    }
   
}
