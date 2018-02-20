import java.util.Scanner;

public class Task8Loop {
    //Loops
    public static void main(String[] args) {
        final String passwordCorrect = "Polska";
        Scanner scanner = new Scanner(System.in);

        String typedPassword;
        do{
            System.out.print("Podaj hasło: ");
            typedPassword = scanner.nextLine();
        }while (!typedPassword.equals(passwordCorrect));

        System.out.println("Podałes poprawne hasło!");
    }
}
