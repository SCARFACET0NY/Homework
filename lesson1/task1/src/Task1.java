import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int decimalNumber = 0;

        System.out.println("Enter a number in binary format: ");

        Scanner scanner = new Scanner(System.in);
        String binaryNumber = scanner.nextLine();

        for (char bit : binaryNumber.toCharArray()) {
            decimalNumber <<= 1;
            decimalNumber |= Character.getNumericValue(bit);
        }

        System.out.println(binaryNumber + " -> " + decimalNumber);
    }
}