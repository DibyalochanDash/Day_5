package Day_5;

public class RecursionPower {

	public static void main(String[] args) {
		int a = 2;
		int n = 17;
		
		int res = Pow(a,n);
		System.out.println(res);
		
		int result = SecondMethodPow(a,n);
		System.out.println(result);
	}

	private static int SecondMethodPow(int a, int n) {
		if (n == 1) {
			return a;
		}
		int temp = SecondMethodPow(a , n/2);
		if (n%2 == 0) {
			return temp * temp;
		} else {
            return temp * temp * a;  
		}
		
	}

	private static int Pow(int a, int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return a;
		}
		int temp = Pow (a,n -1);
		return temp * a;
	}

}
