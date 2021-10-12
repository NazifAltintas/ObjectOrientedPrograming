package be.intecbrussel;

import java.util.Random;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hey user, give me a number.");
        int userNumber = userInput.nextInt();
        System.out.println("Give me a number once again.");
        int userNumber2 = userInput.nextInt();
        int sum = userNumber + userNumber2;
        System.out.println("The sum of your number is :" + sum);

        Random myRandom = new Random();
        int randomNumber = (myRandom.nextInt(154) + 1);
        System.out.println(randomNumber);

        userInput.close();

        // java.util.Scanner userInput=new java.util.Scanner(System.in);    is OKE
    }

}
