public class HulkProgram {

    public static void helpDrBanner(int n) {
        String hate = "I hate";
        String love = "I love";

        if (n == 1) {
            System.out.print(hate);
        } else {
            System.out.print(hate);
            for (int i = 1; i < n; i++) {
                if (i % 2 == 0) {
                    System.out.print(" that " + hate);
                } else {
                    System.out.print(" that " + love);
                }
            }
        }
        System.out.print(" it.");
    }


    public static void main(String[] args) {
//        helpDrBanner(10);
        System.out.println(24/5);
    }
}