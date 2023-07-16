package CaglaSonmez;

import java.util.Scanner;
public class KuvvetleriBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            int power4 = (int) Math.pow(4, i);
            int power5 = (int) Math.pow(5, i);
            System.out.println("4^" + i + " = " + power4);
            System.out.println("5^" + i + " = " + power5);
        }
    }
}
