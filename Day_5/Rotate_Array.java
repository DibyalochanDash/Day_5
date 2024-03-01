package Day_5;

public class Rotate_Array {

	public static void main(String[] args) {
		
		int arr[] = {3 , -2 ,1 , 4 ,6 , 9 , 8};
		
		int k = 3;
		Rotate(arr,k);
		

	}

	private static void Rotate(int[] arr,int k) {
	
		k = k % arr.length;
		reverse(arr, 0 ,arr.length-1);
		reverse(arr , 0 , k-1);
		reverse(arr ,k ,arr.length-1);
		
        for (int i : arr) {
			System.out.print(i+" ");
		}
		
	}

	private static void reverse(int[] arr, int i, int j) {
		
		while (i < j) {
		    int temp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;
		    i++; j--;
		}
		
	}

}
