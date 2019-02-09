package ders16;
// Short link: https://jpst.it/1ATj4

import java.util.Scanner;

public class ders16_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("User Name:");
        String u = sc.nextLine();
        if (user(u)) {
            System.out.println("Kullanıcı Adı Doğru");
            System.out.println("User Name:");
            String p = sc.nextLine();
            if (pass(p)) {
                System.out.println("Şifre Doğru");
            } else {
                System.out.println("şifre Yanlış");
            }
        } else {
            System.out.println("Hatalı Kullanıcı Adı");
        }

    }

    public static boolean user(String u) {
        boolean x = false;
        if (u.equals("text")) {
            x = true;
        }
        return x;
    }

    public static boolean pass(String p) {

        if (p.equals("1234")) {
            return true;
        } else {
            return false;
        }

    }

}
