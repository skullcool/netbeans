
package ders19;

import java.util.Random;

public class Ders19 {

    public static void main(String[] args) {
     Random rd =new Random();
     int[] p1={0,0,0};
     int[] p2={0,0,0};
     int p1Toplam=0;
     int p2Toplam=0;
    for (int i = 0; i < p1.length; i++) {
        p1[i]=rd.nextInt(6)+1;
        p2[i]=rd.nextInt(6)+1;
        p1Toplam +=p1[i];
        p2Toplam +=p2[i];
    }
    System.out.println("P1="+p1Toplam);
    System.out.println("P2="+p2Toplam);
    
    if (p1Toplam>p2Toplam) {
        System.out.println("P1 Kazandı="+p1Toplam);      
   }else if(p1Toplam<p2Toplam){
        System.out.println("P2 Kazandı="+p2Toplam);
   }else{
        System.out.println("Kasa Kazanır"); 
   }
    
     
     
    }
}
