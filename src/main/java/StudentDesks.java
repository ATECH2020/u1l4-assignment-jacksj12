import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        int room1 = scanner.nextInt();
        int room2 = scanner.nextInt();
        int room3 = scanner.nextInt();

        System.out.print( room1/2 + room1 %2 + room2/2 + room2 %2 + room3/2 + room3 %2);


        // closing the scanner object
        scanner.close();
    }
}