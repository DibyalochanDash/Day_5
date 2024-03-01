package Day_5;

import java.util.HashMap;

public class ArraysFrequencyCount {

	public static void main(String[] args) {
		
		int arr1[] = {2,6,3,8,2,8,2,3,8,10,6};
		int arr2[] = {2,8,3,5,10,6};
      
		FrequencyCount(arr1,arr2);
	}

	private static void FrequencyCount(int[] arr1, int[] arr2) {
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for (int i = 0; i < arr1.length; i++) {
			if (hm.containsKey(arr1[i])== true) {
				
				int temp = hm.get(arr1[i]);
				hm.put(arr1[i], temp+1);
			} else {
               hm.put(arr1[i], 1);
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			int ral = arr2[i];
               if (hm.containsKey(arr2[i])== true) {
				
				System.out.println(arr2[i]+" : "+ hm.get(ral));
			} else {
              System.out.println( arr2[i]+" : "+ 0);
			}
		}
		}
	}


