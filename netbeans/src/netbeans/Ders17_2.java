



public class Ders17_2 {
    //overload
   public static void skor(){
       System.out.println("Bilgilerinize Ulaşılamadı");
   }
   
   public static void skor(String x){
       System.out.println(x +" Oyuncusunun Puanınına Ulaşılamadı" );        
   }
   
   public static void skor(int x){
       System.out.println("İsimsiz Oyuncunun " + x 
               +" Puanı Var");
   }
   
   public static void skor(String x, int y){
        System.out.println( x +" Oyuncunun " + y 
               +" Puanı Var");
   }
   
    public static void main(String[] args) {
        skor("Şafak", 100);
       
    }
}
