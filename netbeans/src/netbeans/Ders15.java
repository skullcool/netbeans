package ders15;
public class Ders15 {

    public static void main(String[] args) {
        selamlama("Şafak");
        faktoriyel(5);
        chrornek('1');
        dogruyanlis(true);
       
    }
    public static void dogruyanlis(boolean dy){
        System.out.println("Sonuç "+ dy);
    }
    public static void chrornek(char chr){
        System.out.println("Char Veri Tipi=>" + chr ); 
   }
    public static void faktoriyel(int f){
        int snc=1;
        for (int i = 1; i <= f; i++) {
            snc=snc*i;
            
        }
        System.out.println("Sonuç "+ snc);
 
    }
    
    public static void selamlama(String adi){
        System.out.println("Merhaba => " +adi);
    }
    
    
   
    
    
    
}
