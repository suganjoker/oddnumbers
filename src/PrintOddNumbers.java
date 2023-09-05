import java.util.Scanner;

public class PrintOddNumbers {

    public static void printOddNumbers(int n) {
        if (n <= 0) {
            return;
        }
        if (n % 2 != 0) {
            System.out.println(n);
        }
        printOddNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit for printing odd numbers: ");

        int limit = scanner.nextInt();

        if (limit > 0) {
            printOddNumbers(limit);
        } else {
            System.out.println("enter a number greater than 0");
        }

        scanner.close();
    }
}