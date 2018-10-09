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
                exercise1.ex1();
                break;
            case 3:
                Navigate exercise2 = new Navigate();
                exercise2.nav();
                break;
            case 4:
                RespEarth respEarth = new RespEarth();
                respEarth.earth();
                break;
            case 5:
                ResizeWindow resizeWindow = new ResizeWindow();
                resizeWindow.resize();
                break;
            case 6:
                WindowSwitch windowSwitch = new WindowSwitch();
                windowSwitch.switchWindow();
                break;
            case 7:
                Firefox firefox = new Firefox();
                firefox.FF();
                break;
            case 8:
                Alerts alerts = new Alerts();
                alerts.alert();
                break;
            case 9:
                FindAllLinks findAllLinks = new FindAllLinks();
                findAllLinks.allLinks();
                break;
            case 10:
                HomeWork1 homework1 = new HomeWork1();
                homework1.hw1();
                break;
            default:
                break;
        }
    }

}
