import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int degrees = scanner.nextInt();

        System.out.print(degrees % 30 * 12);

        // closing the scanner object
        scanner.close();
    }
}