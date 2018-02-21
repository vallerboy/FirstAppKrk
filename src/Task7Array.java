import java.util.Arrays;

public class Task7Array {
    public static void main(String[] args) {
        int[] ints = {2,3,4,2,1,2,2,2,1,2,4,5,6};

        Arrays.sort(ints);

        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }

        int lastInt = ints[0];
        int counter = 1;

        for (int anInt : ints) {
            if(lastInt == anInt){
                counter++;
            }else{
                if(counter >= 3){
                    System.out.println("Mamy to!");
                    break;
                }else{
                    counter = 1;
                    lastInt = anInt;
                }
            }
        }
    }
}
