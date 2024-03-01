package Day_5;

public class Swap_Xor {

	public static void main(String[] args) {
		
		int a = 34;
		int b = 76;
		
		System.out.print("Before Swap "+ a +" "+ b);
      
		Swap_number(a,b);
	}

	private static void Swap_number(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println();
		System.out.println("After Swap "+ a +" "+ b);
	}

}
