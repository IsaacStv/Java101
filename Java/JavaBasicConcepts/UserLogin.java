package JavaBasicConcepts;

import java.util.Scanner;

public class UserLogin {

    public static void main(String[] args) {

        String userName, password, sifir, newPassword;

        Scanner scan = new Scanner(System.in);

        System.out.println("Kullanici Adiniz: ");

        userName = scan.nextLine();

        System.out.println("Sifreniz: ");

        password = scan.nextLine();

        if (userName.equals("Mehmet") && password.equals("abc123")) {
            System.out.println("Giris Yaptiniz");
        } else {
            System.out.println("Hatali bilgi girdiniz, Sifrenizi Sifirlamak Istermisiniz? Evet/Hayir");
            sifir = scan.nextLine();
            if (sifir.equalsIgnoreCase("Evet")) {
                System.out.println("Lutfen Yeni Sifreyi Giriniz");
                newPassword = scan.nextLine();
                if (newPassword.equals(password) || newPassword.equals("abc123")) {
                    System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
                } else {
                    System.out.println("Sifre olusturuldu");
                }
            } else {
                System.out.println("Daha sonra tekrar deneyin");
            }
        }

    }

}
