import java.util.Scanner;

public class Punctuation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter: ");
        String text = scanner.nextLine();

        String[] textSplit = text.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String s : textSplit
        ) {
            if (s.contains(",")) {
                String[] splitC = s.split(",");
                for (int i = 0; i < splitC.length; i++) {
                    if (i == splitC.length - 1) {
                        result.insert(result.length() - 1, splitC[i]);
                    } else {
                        result.insert(result.length() - 1, splitC[i] + ", ");
                    }
                }
            } else {
                result.append(s).append(" ");
            }
        }
        System.out.println(result);

    }
}
