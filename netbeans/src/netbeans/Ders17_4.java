
import java.util.List;
import java.util.Scanner;


public class Ders17_4 {
    public static void topla(){
        System.out.println("Sonuc=0");
    }
    
    public static void topla(int x, int y){
        System.out.println("Sonuc:"+ (x+y));
    }
    
    public static void topla(double x, double y){
       System.out.println("Sonuc:"+ (x+y)); 
    }
    public static void topla(int x, int y,int z){
        System.out.println("Sonuc:"+ (x+y+z));
    }
    public static void topla(double x, double y,double z){
        System.out.println("Sonuc:"+ (x+y+z));
    }
    public static void main(String[] args) {
        topla(2,5);
        topla(2.4,4.5,3.2);
        
        
    }
           
}
