import java.util.Scanner;

public class Task2 {
    //String
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj słowo: ");
        String word = scanner.nextLine();

        System.out.print("Podaj N: ");
        int n = scanner.nextInt();

        System.out.println("Wycięty: " + (word.substring(word.length()-n)));

    }
}
