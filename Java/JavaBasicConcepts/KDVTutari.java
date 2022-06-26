package JavaBasicConcepts;

import java.util.Scanner;

public class KDVTutari {

    public static void main(String[] args) {

        double tutar, kdvTutar, kdvliTutar;
        double kdvOrani = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("Ucret Tutarini Girliniz: ");

        tutar = input.nextDouble();

        kdvTutar = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz tutar: " + tutar);

        System.out.println("KDV orani: " + kdvOrani);

        System.out.println("KDV tutari: " + kdvTutar);

        System.out.println("KDV'li tutar: " + kdvliTutar);
    }
}
