package Day_5;

import java.util.HashSet;

public class DistinctElement {

	public static void main(String[] args) {
		int arr[] = {2, 3, 4, 5, 2, 3, 6};
  
		Distinct(arr);
	}

	private static void Distinct(int[] arr) {
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		System.out.println(hs.size()+" "+ hs.toString());
		
	}

}
