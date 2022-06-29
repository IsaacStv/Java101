package JavaBasicConcepts;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int n1, n2, select;

        Scanner input = new Scanner(System.in);

        System.out.println("Ilk Sayiyi Giriniz: ");
        n1 = input.nextInt();
        System.out.println("Ikinci Sayiyi Giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.println("Seciminiz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Toplam: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Toplam: " + (n1 * n2));
                break;
            case 4:
                switch (n2) {
                    case 0:
                        System.out.println("Sayi sifira bolunemez");
                        break;
                    default:
                        System.out.println("");
                }
                break;
            default:
                System.out.println("Yanlis Secim Yaptiniz. Tekrar Deneyiniz");
        }

    }
}
