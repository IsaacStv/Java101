package JavaBasicConcepts;

import java.util.Scanner;

public class ScannerEntry {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Bir Deger Giriniz: ");
            String str = input.nextLine();
            System.out.println(str);
        }
    }

}
