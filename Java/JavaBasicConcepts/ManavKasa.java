package JavaBasicConcepts;

import java.util.Scanner;

public class ManavKasa {

    public static void main(String[] args) {
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;
        int a, e, d, m, p;
        double toplam;
        Scanner input = new Scanner(System.in);

        System.out.println("Armut kac kilo");
        a = input.nextInt();
        System.out.println("Elma kac kilo");
        e = input.nextInt();
        System.out.println("Domates kac kilo");
        d = input.nextInt();
        System.out.println("Muz kac kilo");
        m = input.nextInt();
        System.out.println("Patlican kac kilo");
        p = input.nextInt();

        toplam = (a * armut) + (e * elma) + (d * domates) + (m * muz) + (p * patlican);

        System.out.println("Toplam tutar: " + toplam + " TL");
    }
}
