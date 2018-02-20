import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {


        for (int i = 5; i <= 10; i++) {
            System.out.println(i);
        }



        STasdsadsadsadasdasdsaddART:
        for (int i = 0; i < 10; i++) {
            for (int i1 = 0; i1 < 10; i1++) {
                if(i == 2){
                    break STasdsadsadsadasdasdsaddART;
                }
                System.out.println("x: " + i + " y: " + i1);
            }
        }


        Random random = new Random();
        random.nextInt(1000);
    }
}
