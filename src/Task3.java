import java.util.Scanner;

public class Task3 {
    //String
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        if(word.endsWith("M") || word.endsWith("m")){
            System.out.println("Tak");
        }else{
            System.out.println("Nie");
        }


        ////////// II /////////////

        if(word.toLowerCase().endsWith("m")){
            System.out.println("Tak");
        }else{
            System.out.println("Nie");
        }
    }
}
