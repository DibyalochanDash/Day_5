package Day_5;

public class Two_Sum_presentNumber {

	public static void main(String[] args) {
       
		int arr[] = {2,5,4,6,7,9};
		int k = 11;
		
		SumNumber(arr,k);

	}

	private static void SumNumber(int[] arr, int k) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i +1; j < arr.length; j++) {
				if (arr[i]+arr[j]==k) {
					System.out.println("True");
					return;
				}
			}
		}
		System.out.println("False");
		
	}

}
