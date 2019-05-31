public class Task3 {
    private static int countBits(byte number) {
        number = (byte) (number | 1);
        int count = 0;
        while (number !=  0) {
            number <<= 1;
            count++;
        }
        return  count;
    }

    private static int countBits(short number) {
        number = (short) (number | 1);
        int count = 0;
        while (number !=  0) {
            number <<= 1;
            count++;
        }
        return  count;
    }

    private static int countBits(int number) {
        number =  number | 1;
        int count = 0;
        while (number !=  0) {
            number <<= 1;
            count++;
        }
        return  count;
    }

    private static int countBits(long number) {
        number = (number | 1);
        int count = 0;
        while (number !=  0) {
            number <<= 1;
            count++;
        }
        return  count;
    }

    public static void main(String[] args) {
        byte b = -5;
        short s = -5;
        int i = -5;
        long l = -5;

        System.out.println(countBits(b));
        System.out.println(countBits(s));
        System.out.println(countBits(i));
        System.out.println(countBits(l));
    }
}