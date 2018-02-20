import java.util.Scanner;

public class Task6Array {
    public static void main(String[] args) {

        //Wprowadzenie liczb oddzielonych spacja do konsoli
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczby oddzielone spacja: ");
        String numbers = scanner.nextLine();

        //Rozdzielamy String po spacji, uzyskujac kazda liczbe pod innym indexem
        String[] numbersArray = numbers.split(" ");

        //Konwert na tablice intów
        int[] numbersOfInt = new int[numbersArray.length];

        for (int i = 0; i < numbersArray.length; i++) {
            numbersOfInt[i] = Integer.parseInt(numbersArray[i]);
        }
    }
}
