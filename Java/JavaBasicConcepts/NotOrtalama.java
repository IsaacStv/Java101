package JavaBasicConcepts;

import java.util.Scanner;

public class NotOrtalama {

    public static void main(String[] args) {

        // Degisken olustur
        int mat, fizik, kimya, biyoloji, tarih;

        // scanner sinifi tanimlandi
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz: ");
        mat = input.nextInt();

        System.out.println("Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();

        System.out.println("Kimya Notunuzu Giriniz: ");
        kimya = input.nextInt();

        System.out.println("Biyoloji Notunuzu Giriniz: ");
        biyoloji = input.nextInt();

        System.out.println("Tarih Notunuzu Giriniz: ");
        tarih = input.nextInt();

        int sonuc = (mat + fizik + kimya + biyoloji + tarih) / 6;

        System.out.println("Not Oratalamaniz: " + sonuc);

        if (sonuc > 60) {
            System.out.println("Sinifi Gecti");
        } else {
            System.out.println("Sinifta Kaldi");
        }
    }

}
