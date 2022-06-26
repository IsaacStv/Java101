package JavaBasicConcepts;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class AreaOfCircle {
    public static void main(String[] args) {

        double pi = 3.14;
        int angle, r;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of circle");
        r = input.nextInt();
        System.out.println("Please enter the desired angle of circle");
        angle = input.nextInt();

        area = (pi * r * r * angle) / 360;

        System.out.println("Area of " + angle + " degree piece of circle is: " + area);

    }
}
