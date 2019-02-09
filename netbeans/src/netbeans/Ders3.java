
package ders15;

import java.util.Scanner;

public class Ders3 {
    int para = 1000;
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Seçiniz : ");
        System.out.println("1-Bakiye Görüntüle");
        System.out.println("2-Para Çek");
        System.out.println("3-Para Yatır");
        int i= sc.nextInt();
        int para= 1000;
        double xx= (double)para;
        switch (i) {
            case 1:
                bakiye(para);
                break ;
            case 2:
                paraCek(para);
                break ;
            case 3:
                paraEkle(para);
                break ;
            default :
                System.out.println("Hata!!!");
                break;
        }
        
    }
    public static void bakiye(double bk ){
        
        System.out.println("Bakiyeniz "+bk +" TL");
    }
    public static void paraCek(double p){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Çekilecek miktarı girin");
        double miktar=sc.nextDouble();
        double kesinti = miktar* (1.6/100);
        double bakiye = p - miktar -kesinti;
        bakiye(bakiye);
        
    }
    
    public static void paraEkle(double p){
        Scanner sc = new Scanner(System.in);
        System.out.println("Yatırılacak miktarı girin"); 
      double para= p+sc.nextDouble();
      bakiye(para);
    }
    
    
   
    
   
   
    
            
}
