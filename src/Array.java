import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        String[] names = {"Oskar", "Ktoś", "Coś"};
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }




        for (String name : names) {
            
        }

        printNames("Oskar", "Tomek", "Damian", "Karolina");
    }


    public static void printNames(String ... names){
        for (String name : names) {
            System.out.println(name);
        }
    }
}
