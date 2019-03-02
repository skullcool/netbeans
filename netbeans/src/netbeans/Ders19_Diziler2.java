       int a= 1;
        int[] sayilar={0,0,0,0,0};
       Random rd = new Random();
        int tpl=0;
        for (int i = 0; i < sayilar.length; i++) {
           // System.out.println("ilk"+sayilar[i]);
            sayilar[i]=(int)rd.nextInt(6)+1;
            System.out.println(i+"-son-"+sayilar[i]);
            tpl += sayilar[i];
            System.out.println("Toplam"+ tpl);
        }
        
