
public class Ders17_5 {
    public static void personel(){
        System.out.println("Sonuç Yok");
    }
    public static void personel(String adi){
        System.out.println("Personelin ismi : " + adi 
                +" Çalışma Saati Yok");
    }
    public static void personel(int saat){
        System.out.println("Personelin ismi Yok, "
                + "Çalışma Saati: " + saat );
    }
    public static void personel(String adi, int saat){
        System.out.println("Personelin ismi : " + adi 
                +" Çalışma Saati:" + saat );
    }
    public static void main(String[] args) {
        personel();
        personel("Şafak", 10);
    }
 
}
