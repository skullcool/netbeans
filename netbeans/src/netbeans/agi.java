
package ders15;

import java.util.Scanner;

public class agi {
    
    public static void main(String[] args) {
        /*
        Çalışanın bizzat kendisi -> %50
Çalışmayan eş -> %10
Birinci çocuk -> %7,5
İkinci çocuk -> %7,5
Üçüncü çocuk -> %10 (3 çocuk parolası)
Daha sonraki çocuklar -> %5 (Fazlası zarar sanırım)
        
        */
        
        System.out.println("Çalışanın bizzat kendisi -> %50\n" +
        "Çalışmayan eş -> %10\n" +
        "Birinci çocuk -> %7,5\n" +
        "İkinci çocuk -> %7,5\n" +
        "Üçüncü çocuk -> %10 (3 çocuk parolası)\n" +
        "Daha sonraki çocuklar -> %5 (Fazlası zarar sanırım)");
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("Eş Durumu çalışan = 0, Çalışmıyor =1");
        int es = sc.nextInt();
        System.out.println("Çocuk Sayısı");
        int cs = sc.nextInt();
        
        secim(es, cs);
        
    
    }
    
    public static void secim(int es, int cs){
        double tplYuzde=.5;
        if (es==1) {
            tplYuzde += .1;
        }
        if (cs==1) {
            tplYuzde +=.075; 
        }else if(cs==2){
            tplYuzde +=.15;
        }else if(cs==3){
            tplYuzde +=.25;
        }else if(cs==4){
            tplYuzde +=.30;
        }else if(cs>=5){
            tplYuzde +=.35;
        }
        
        agi(tplYuzde);
    }
    public static void agi(double yo){
 //(Asgari brüt ücret) x 12 x (Yukarıdaki oran) x %15 <gelir vergisi oranı> / 12       
    
    double abu= 1777.50;
    //yo= 0.50;
    double gv = 0.15;
    double snc = abu*12*yo*gv/12;
    System.out.println("AGİ Sonuç:"+ snc + " TL");
    
    
    
    }
}
