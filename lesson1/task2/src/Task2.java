import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt() - 1;

        System.out.println(~number);
    }
}