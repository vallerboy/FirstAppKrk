import java.util.Arrays;

public class Task3Array {
    public static void main(String[] args) {
        int[] numbers  = {1,2,4,5,3,1,23,2,2,2,2,2,1,1,22,2,44,12,2};

        //Arrays.sort(numbers);

        int maxCounter = 0;
        int numberMaxCounter = 0;

        for (int number : numbers) {
            int localCounter = 0;

            if(number == numberMaxCounter){
                continue;
            }

            for (int i : numbers) {
                   if(number == i){
                       localCounter++;
                   }
            }

            if(maxCounter < localCounter){
                maxCounter = localCounter;
                numberMaxCounter = number;
            }

        }

        System.out.println("Naj liczba: " + numberMaxCounter);
    }
}
