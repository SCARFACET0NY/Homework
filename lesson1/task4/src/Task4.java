public class Task4 {
    private static int gcd(int number1, int number2) {
        if (number1 == 0) return number2;
        if (number2 == 0) return number1;

        // Finding greatest power of 2 that divides both number1 and number 2
        int shift;
        for (shift = 0; ((number1 | number2) & 1) == 0; ++shift) {
            number1 >>= 1;
            number2 >>= 1;
        }

        // Dividing by 2 until number1 becomes odd
        while ((number1 & 1) == 0) {
            number1 >>= 1;
        }

        do {
            // If number2 is even, delete by factor of 2 until odd
            while ((number2 & 1) == 0) {
                number2 >>= 1;
            }

            // If necessary swap, so number1 is always <= number2
            if (number1 > number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            number2 = number2 - number1;
        } while (number2 != 0);

        // Restore factors of 2
        return number1 << shift;
    }

    public static void main(String[] args) {
        System.out.println(gcd(96, 60));
    }
}