
public class Ders17_1 {
    
    public static void main(String[] args) {
        if (gecKal(hesala(50,45))) {
            System.out.println("Geçtiniz. Tebrikler..."); 
        }else{
            System.out.println("Kaldınız. Üzgünüz...");
        }
        
    }
    
    public static double hesala(int y1)
    {
        double x= (double)y1;
        return x;
    }
    
    public static double hesala(int y1,int y2)
    {
        double x= (y1+y2)/2;
        return x;
    }
    public static double hesala(int y1, int y2, int s1)
    {
        double x= (y1+y2+s1)/3;
        return x;
    }
    public static double hesala(int y1, int y2, int s1, int s2)
    {
        double x= (y1+y2+s1+s2)/4;
        return x;
    }
 
    public static boolean gecKal(double x){  
        if (x>=50) {
            return true;
        }else{
            return false;
        }
    }
}
