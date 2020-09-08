import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
        int hoursD = hours2 - hours1;
        int minutesD = minutes2 - minutes1;
        int secondsD = seconds2 - seconds1;

        System.out.print(hoursD * 3600 + minutesD * 60 + secondsD);


        // closing the scanner object
        scanner.close();
    }
}