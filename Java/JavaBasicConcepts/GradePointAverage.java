package JavaBasicConcepts;

import java.util.Scanner;

public class GradePointAverage {

    public static void main(String[] args) {

        int mat, fizik, kimya, biyoloji, tarih;

        Scanner scan = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz: ");
        mat = scan.nextInt();
        System.out.println("Fizik Notunuzu Giriniz: ");
        fizik = scan.nextInt();
        System.out.println("Kimya Notunuzu Giriniz: ");
        kimya = scan.nextInt();
        System.out.println("Biyoloji Notunuzu Giriniz: ");
        biyoloji = scan.nextInt();
        System.out.println("Tarih Notunuzu Giriniz: ");
        tarih = scan.nextInt();

        if (mat < 0 || mat > 100) {
            mat = 0;
        }
        if (fizik < 0 || fizik > 100) {
            fizik = 0;
        }
        if (kimya < 0 || kimya > 100) {
            kimya = 0;
        }
        if (biyoloji < 0 || biyoloji > 100) {
            biyoloji = 0;
        }
        if (tarih < 0 || tarih > 100) {
            tarih = 0;
        }

        double average = (mat + fizik + kimya + biyoloji + tarih) / 5;

        if (average < 55) {
            System.out.println("Sinifta Kaldiniz");
        } else {
            System.out.println("Tebrikler. Sinifi Gectiniz");
        }

        System.out.println("Ortalamaniz: " + average);
    }

}
