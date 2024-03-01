package Day_5;

public class FindUniqueElement {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,3,2,1,5};
		
		SingleElement(arr);
	}

	private static void SingleElement(int[] arr) {
	    int ans = 0;
	    for (int i = 0; i < arr.length; i++) {
			ans ^= arr[i];
		}
		System.out.println(ans);
	}

}
