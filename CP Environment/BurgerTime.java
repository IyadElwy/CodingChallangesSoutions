package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BurgerTime {
	
	public static int getShortestBurgerDrug() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter second line: ");
		String contestants = sc.nextLine();
		
		String [] highwayRoadMap = contestants.split("");
		
		
		ArrayList<Integer> minValues = new ArrayList<>();
		
		for (int i = 0; i < highwayRoadMap.length; i++) {
			if (highwayRoadMap[i] == "Z") {
				return 0;
			}
			if (highwayRoadMap[i] == "R") {
				for (int j = 0; j < highwayRoadMap.length; j++) {
					if (highwayRoadMap[j] == "D") {
						minValues.add(j-i);
						System.out.println("dd");
					}
				}
			}
		}
		
		Collections.sort(minValues, Collections.reverseOrder());
		
		if (minValues.isEmpty()) {
			return 0;
		}
		return minValues.get(0);
	}
	
	public static Integer[] strArrToIntArr(String[] arr) {
		Integer [] resultArr = new Integer[arr.length];
		for (int i = 0; i < arr.length; i++) {
			resultArr[i] = Integer.parseInt(arr[i]);
		}
		return resultArr;
	}
	
	public static void main(String[] args) {
		System.out.println(getShortestBurgerDrug());
	}

}
