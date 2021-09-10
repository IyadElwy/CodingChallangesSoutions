import java.util.ArrayList;
import java.util.Scanner;

public class FindCriminals {
    private int homeIndex;
    private ArrayList<Integer> citiesWithCriminalCounts;

    public FindCriminals(int homeIndex, ArrayList<Integer> citiesWithCriminalCounts) {
        this.homeIndex = homeIndex;
        this.citiesWithCriminalCounts = citiesWithCriminalCounts;
    }

    public int criminalsCaught() {
        int caught = 0;
        for (int i = 0; i < citiesWithCriminalCounts.size(); i++) {
            if (citiesWithCriminalCounts.get(i) != 0) {
                int distanceFromThief = Math.abs(this.homeIndex - i);
                int anotherCity = getAnotherCityWithDistance(distanceFromThief);
                if (anotherCity != -1) {
                    if (citiesWithCriminalCounts.get(anotherCity) != 0) {
                        caught += citiesWithCriminalCounts.get(i);
                    }
                }
            }
        }
        return caught+1;
    }

    public int getAnotherCityWithDistance(int distance) {
        for (Integer citiesWithCriminalCount : citiesWithCriminalCounts) {
            int tempDistance = Math.abs(citiesWithCriminalCount - distance);
            if (tempDistance == 0) {
                return distance;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> citiesArrayList = new ArrayList<>();

        System.out.println("Enter position: ");
        int pos = scanner.nextInt();

        System.out.println("Enter cities: ");
        String citiesString3 = scanner.nextLine();
        String citiesString = scanner.nextLine();
        String[] dataSep = citiesString.split(" ");

        for (String s : dataSep) {
            citiesArrayList.add(Integer.parseInt(s));
        }

        FindCriminals findCriminals = new FindCriminals(pos, citiesArrayList);
        System.out.println(findCriminals.criminalsCaught());
        scanner.close();
    }
}
