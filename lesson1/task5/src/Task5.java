public class Task5 {
    private static int modifyBit(int number, int position, int bit) {
        return bit == 0 ? number & ~(1 << position) : number | (1 << position);
    }

    public static void main(String[] args) {
        System.out.println(modifyBit(15, 2, 0));
        System.out.println (modifyBit(8, 5, 1));
    }
}