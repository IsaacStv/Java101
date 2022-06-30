package JavaBasicConcepts;

import java.util.Scanner;

public class ZodiacFinder {

    public static void main(String[] args) {

        int month, day;

        Scanner scan = new Scanner(System.in);

        System.out.println("Which month did you born: ");
        month = scan.nextInt();
        System.out.println("Which day did you born: ");
        day = scan.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("Oglak Burcu");
                } else {
                    System.out.println("Kova Burcu");
                }
            } else {
                System.out.println("Hatali bir gun girdiniz");
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 28) {
                if (day < 20) {
                    System.out.println("Kova Burcu");
                } else {
                    System.out.println("Balik Burcu");
                }
            } else {
                System.out.println("Hatali bir gun girdiniz");
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    System.out.println("Balik Burcu");
                } else {
                    System.out.println("Koc Burcu");
                }
            } else {
                System.out.println("Hatali bir gun girdiniz");
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    System.out.println("Koc Burcu");
                } else {
                    System.out.println("Boga Burcu");
                }
            } else {
                System.out.println("Hatali bir gun girdiniz");
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("Boga Burcu");
                } else {
                    System.out.println("Ikizler Burcu");
                }
            } else {
                System.out.println("Hatali bir gun girdiniz");
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    System.out.println("Ikizler Burcu");
                } else {
                    System.out.println("Yengec Burcu");
                }
            } else {
                System.out.println("Hatali bir gun girdiniz");
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    System.out.println("Yengec Burcu");
                } else {
                    System.out.println("Aslan Burcu");
                }
            } else {
                System.out.println("Hatali bir gun girdiniz");
            }
        } else if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    System.out.println("Aslan Burcu");
                } else {
                    System.out.println("Basak Burcu");
                }
            } else {
                System.out.println("Hatali bir gun girdiniz");
            }
        } else if (month == 9) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    System.out.println("Basak Burcu");
                } else {
                    System.out.println("Terazi Burcu");
                }
            } else {
                System.out.println("Hatali bir gun girdiniz");
            }
        } else if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    System.out.println("Terazi Burcu");
                } else {
                    System.out.println("Akrep Burcu");
                }
            } else {
                System.out.println("Hatali bir gun girdiniz");
            }
        } else if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    System.out.println("Akrep Burcu");
                } else {
                    System.out.println("Yay Burcu");
                }
            } else {
                System.out.println("Hatali bir gun girdiniz");
            }
        } else if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("Yay Burcu");
                } else {
                    System.out.println("Oglak Burcu");
                }
            } else {
                System.out.println("Hatali bir gun girdiniz");
            }
        } else {
            System.out.println("Hatali bir ay girdiniz");
        }
    }
}
