package JavaBasicConcepts;

import java.util.Scanner;

public class TriangleAreaCalc {

    public static void main(String[] args) {

        int a, b, c;
        double Area, perimeterHalf;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first side length");

        a = input.nextInt();

        System.out.println("Please enter second side length");

        b = input.nextInt();

        System.out.println("Please enter third side length");

        c = input.nextInt();

        // Perimater Half
        perimeterHalf = (a + b + c) / 2;
        System.out.println(perimeterHalf);

        Area = Math.sqrt(perimeterHalf * (perimeterHalf - a) * (perimeterHalf - b) * (perimeterHalf - c));
        System.out.println("Area of Triangle is: "
                + Area);
    }
}
