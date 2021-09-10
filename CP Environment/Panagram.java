public class Panagram {

    public static boolean isPangram(String sentence) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet.length() - 1; i++) {
            if (!sentence.toLowerCase().contains(Character.toString(alphabet.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPangram("Jackdawslovemybigsphinxofquartz"));

    }
}
