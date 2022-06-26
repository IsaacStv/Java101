package JavaBasicConcepts;

import java.net.http.HttpResponse.BodySubscriber;
import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {

        double height, bodyMassIndex;
        int weight;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your height in meter");
        height = input.nextDouble();
        System.out.println("Please enter your weight");
        weight = input.nextInt();

        bodyMassIndex = weight / (height * height);

        System.out.println("Your Body Mass Index is: " + bodyMassIndex);
    }
}
