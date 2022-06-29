package JavaBasicConcepts;

import java.util.Scanner;

public class RecommendationProgram {

    public static void main(String[] args) {

        int heat;

        Scanner scan = new Scanner(System.in);
        System.out.println("How much is the air temperature?");
        heat = scan.nextInt();

        if (heat < 5) {
            System.out.println("You should got to ski");
        } else if (heat >= 5 && heat < 15) {
            System.out.println("You should go to theather");
        } else if (heat >= 15 && heat < 25) {
            System.out.println("you should go to picnic");
        } else {
            System.out.println("GO TO SWIIIIMMMM");
        }

    }
}
