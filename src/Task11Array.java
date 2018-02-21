import java.util.Arrays;

public class Task11Array {
    public static void main(String[] args) {
        int[] ints = {2, 4, 7, 9, 4, 2, 1, 4, 8, 6, 38};
        int[] ints2 = {2, 4, 7, 9, 4, 2, 1, 4, 8, 6, 38};
        int k = 3;

        for (int i = 0; i < ints.length; i++) {
            int p = (i+k) % ints.length;
            ints[p]=ints2[i];
        }

        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }


    }
}
