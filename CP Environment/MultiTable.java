import java.util.ArrayList;
import java.util.Scanner;

public class MultiTable {
    private ArrayList<Integer> table;
    private int numberToLookFor;

    public MultiTable(int n, int numberToLookFor) {
        this.numberToLookFor = numberToLookFor;
        this.table = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                table.add(i * j);
            }
        }
    }

    public int countNum() {
        int count = 0;
        for (Integer i : table
        ) {
            if (i == this.numberToLookFor) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter info: ");
        String data
                = scanner.nextLine();
        String[] dataSep = data.split(" ");

        MultiTable multiTable = new MultiTable(Integer.parseInt(dataSep[0]),
                Integer.parseInt(dataSep[1]));
        System.out.println(multiTable.countNum());
    }

}
