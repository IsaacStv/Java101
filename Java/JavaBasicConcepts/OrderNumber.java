package JavaBasicConcepts;

import java.util.Scanner;

public class OrderNumber {

    public static void main(String[] args) {

        int a, b, c;

        Scanner scan = new Scanner(System.in);

        System.out.println("A sayisini giriniz: ");
        a = scan.nextInt();
        System.out.println("B sayisini giriniz: ");
        b = scan.nextInt();
        System.out.println("C sayisini giriniz: ");
        c = scan.nextInt();

        if (a < b && a < c) {
            if (b < c) {
                System.out.println("A<B<C");
            } else {
                System.out.println("A<C<B");
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.println("B<A<C");
            } else {
                System.out.println("B<C<A");
            }
        } else {
            if (a < b) {
                System.out.println("C<A<B");
            } else {
                System.out.println("C<B<A");
            }
        }
    }
}
