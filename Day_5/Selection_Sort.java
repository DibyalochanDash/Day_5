package Day_5;

public class Selection_Sort {

    public static void main(String[] args) {
        int arr[] = {6, 5, 2, 8, 3, 7};
        System.out.println("Before Sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        SelectionSort(arr);

        System.out.println("After Sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void SelectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        
    }
}
