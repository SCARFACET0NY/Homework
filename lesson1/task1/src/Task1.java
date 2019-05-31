import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int decimalNumber = 0, pos = 0;


        System.out.println("Enter a number in binary format: ");

        Scanner scanner = new Scanner(System.in);
        int binaryNumber = scanner.nextInt();

        int temp = binaryNumber;
        while (temp != 0) {
            decimalNumber += (temp % 10) * Math.pow(2, pos++);
            temp /= 10;
        }

        System.out.println(binaryNumber + " -> " + decimalNumber);
    }
}