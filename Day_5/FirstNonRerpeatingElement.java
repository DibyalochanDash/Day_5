package Day_5;

import java.util.HashMap;

public class FirstNonRerpeatingElement {

	public static void main(String[] args) {
		
		int arr[] = {5,4,4,3,6,7,5,6};
		
		FirstUniqueElement(arr);

	}

	private static void FirstUniqueElement(int[] arr) {
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])==true) {
				int temp = hm.get(arr[i]);
				hm.put(arr[i], temp +1);
			} else {
                hm.put(arr[i], 1);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (hm.get(arr[i]) == 1) {
				System.out.println(arr[i]);
				return;
			}
		}
		
	}

}
