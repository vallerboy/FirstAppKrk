public class Task4 {
    public static void main(String[] args) {
        String word = "5czesc";

        // '1' = 49
        String cos = "\" sddsd \"";
        if(word.charAt(0) >= '0' && word.charAt(0) <= '9'){
            System.out.println("Tak");
        }else{
            System.out.println("Nie");
        }

        String cos1 = "Ala " + " ma " + "kota";
        String cos2 = new StringBuilder().append("Ala ").append(" ma ").append("kota").toString();


        long startTime = System.currentTimeMillis();
        StringBuffer stringBuilder = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append(i);
        }
        long stopTime = System.currentTimeMillis();


        long startTime1 = System.currentTimeMillis();
        String test = "";
        for (int i = 0; i < 100000; i++) {
            test += i;
    }
        long stopTime1 = System.currentTimeMillis();

        System.out.println(stopTime-startTime);
        System.out.println(stopTime1-startTime1);
    }
}
