package JavaTrainings.epam;

import java.util.Scanner;

public class FirstSeleniumTry {

    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                FirstTry firstTry = new FirstTry();
                firstTry.First();
                break;
            case 2:
                Exercise1 exercise1 = new Exercise1();
                exercise1.Ex1();
                break;
            case 3:
                Exercise2 exercise2 = new Exercise2();
                exercise2.Ex2();
                break;
            default:
                break;
        }

    }

}
