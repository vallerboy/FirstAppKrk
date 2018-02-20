import java.util.Scanner;

public class Starter {
   public static void main(String[] arg){
       Scanner scanner = new Scanner(System.in);

       String number = "Ala ma kota " + " hehe";
       number = number.concat(" ale kot nie ma Ali!");


       String cos = "Oskar";
       String cos1 = new String("Oskar");

       if(cos.equals(cos1)){
           System.out.println("Prawda");
       }else{
           System.out.println("Fałsz");
       }

       System.out.println(number);
    }

}
