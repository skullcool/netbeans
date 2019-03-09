public class Ders20 {
    
    public static void main(String[] args) {
      
        int[] rakamlar= {2,7,4,0,9,6,0};
        for (int i = 0; i < rakamlar.length; i++) {
            if (rakamlar[i]==0) {
                System.out.println(i+"-var");
            }else{
                System.out.println(i+"-Yok");
            }
        }
        //----------------
        String[] isimler={"Ali","Ayşe","Mehmet"};
        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].equals("Ali")) {
                System.out.println(i+"-Var");
            }
 
        }
        //----
        int[] rakamlar= new int[6];
      rakamlar[0]=3;
      rakamlar[2]=43534543;
      rakamlar[5]=332432;
        for (int i = 0; i < rakamlar.length; i++) {
            System.out.println(i+"-"+rakamlar[i]);
        }
        
       
    }
    
}
