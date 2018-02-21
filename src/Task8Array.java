public class Task8Array {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5,6,1,4,2,12,512,4123,2212,61};

        StringBuilder stringBuilder = new StringBuilder();

        for (int anInt : ints) {
            int rest = anInt % 37;
            if(!stringBuilder.toString().contains(String.valueOf(rest))){
                stringBuilder.append(rest).append(";");
            }
        }

        System.out.println("String: " + stringBuilder.toString());
        System.out.println("Ilosc uni: " + stringBuilder.toString().split(";").length);

    }
}
