import java.util.Scanner;

public class BeautifulYear {
    private int year;

    public BeautifulYear(int year) {
        this.year = year;
    }

    public boolean isDistinct() {
        String year = Integer.toString(this.year);
        char[] yearDigits = year.toCharArray();
        for (int i = 0; i < yearDigits.length; i++) {
            char charToCompare = yearDigits[i];
            for (int j = 0; j < yearDigits.length; j++) {
                if (j != i) {
                    char charTemp = yearDigits[j];
                    if (charToCompare == charTemp) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = scanner.nextInt();

        if (year >= 1000 && year <= 9000) {
            while (true) {
                year++;
                BeautifulYear beautifulYear = new BeautifulYear(year);
                if (beautifulYear.isDistinct()) {
                    System.out.println(year);
                    break;
                }
            }
        }
    }
}
